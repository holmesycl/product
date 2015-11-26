package com.holmesycl.product.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holmesycl.product.domain.meta.TreeNode;
import com.holmesycl.product.domain.meta.UiComponent;
import com.holmesycl.product.domain.meta.UiComponentExample;
import com.holmesycl.product.domain.meta.UiTemplate;
import com.holmesycl.product.domain.meta.UiTemplateExample;
import com.holmesycl.product.persistence.meta.UiComponentMapper;
import com.holmesycl.product.persistence.meta.UiTemplateMapper;
import com.holmesycl.product.service.UiTemplateService;
import com.holmesycl.product.util.ComponentType;
import com.holmesycl.product.util.TagsUtil;

@Service("uiTemplateService")
public class UiTemplateServiceImpl implements UiTemplateService {

	@Autowired
	private UiTemplateMapper uiTemplateMapper;

	@Autowired
	private UiComponentMapper uiComponentMapper;

	private final long ROOT = 0;

	public List<TreeNode> findTemplateTreeByName(String name) {
		List<UiTemplate> tempaltes = findByName(name);
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (UiTemplate template : tempaltes) {
			TreeNode treeNode = createTreeNode(template);
			List<UiComponent> components = findByTemplateAndParent(template.getUiTempId(), ROOT);
			List<TreeNode> nodes = createNodes(components);
			treeNode.setNodes(nodes);
			treeNodes.add(treeNode);
		}
		return treeNodes;
	}

	private List<TreeNode> createNodes(List<UiComponent> components) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (UiComponent component : components) {
			TreeNode treeNode = new TreeNode();
			treeNode.setText(component.getNativeName());
			treeNode.setTags(TagsUtil.createTags(ComponentType.createByOrginName(component.getCompType()).toLocalString()));
			List<UiComponent> childComponents = findByParent(component.getUiComponentId());
			if (childComponents != null && childComponents.size() > 0) {
				List<TreeNode> nodes = createNodes(childComponents);
				treeNode.setNodes(nodes);
			}
			treeNodes.add(treeNode);
		}
		return treeNodes;
	}

	private TreeNode createTreeNode(UiTemplate template) {
		TreeNode treeNode = new TreeNode();
		treeNode.setText(template.getNativeName());
		treeNode.setTags(TagsUtil.createTags(template.getItemType()));
		return treeNode;
	}

	private List<UiTemplate> findByName(String name) {
		UiTemplateExample templateExample = new UiTemplateExample();
		templateExample.createCriteria().andNativeNameLike("%" + name + "%");
		List<UiTemplate> templates = uiTemplateMapper.selectByExample(templateExample);
		return templates;
	}

	private List<UiComponent> findByTemplateAndParent(long templateId, long parentId) {
		UiComponentExample componentExample = new UiComponentExample();
		componentExample.createCriteria().andUiTempIdEqualTo(templateId).andUpUiComponentIdEqualTo(parentId);
		List<UiComponent> components = uiComponentMapper.selectByExample(componentExample);
		return components;
	}

	private List<UiComponent> findByParent(long parentId) {
		UiComponentExample componentExample = new UiComponentExample();
		componentExample.createCriteria().andUpUiComponentIdEqualTo(parentId);
		List<UiComponent> components = uiComponentMapper.selectByExample(componentExample);
		return components;
	}
}
