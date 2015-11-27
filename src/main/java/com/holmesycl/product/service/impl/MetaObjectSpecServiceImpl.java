package com.holmesycl.product.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.holmesycl.product.domain.meta.MetaAttrSpec;
import com.holmesycl.product.domain.meta.MetaAttrSpecExample;
import com.holmesycl.product.domain.meta.MetaObjectSpec;
import com.holmesycl.product.domain.meta.MetaObjectSpecExample;
import com.holmesycl.product.domain.meta.TreeNode;
import com.holmesycl.product.persistence.meta.MetaAttrSpecMapper;
import com.holmesycl.product.persistence.meta.MetaObjectSpecMapper;
import com.holmesycl.product.service.MetaObjectSpecService;
import com.holmesycl.product.util.PageParam;
import com.holmesycl.product.util.SqlUtil;
import com.holmesycl.product.util.TagsUtil;

@Service("metaObjectSpecService")
@Transactional
public class MetaObjectSpecServiceImpl implements MetaObjectSpecService {

	@Autowired
	private MetaObjectSpecMapper metaObjectSpecMapper;

	@Autowired
	private MetaAttrSpecMapper metaAttrSpecMapper;

	public void save(MetaObjectSpec record) {
		metaObjectSpecMapper.insert(record);
	}

	@Transactional(readOnly = true)
	public PageInfo<MetaObjectSpec> page(PageParam pageParam, String query) {
		PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize());
		MetaObjectSpecExample metaObjectSpecExample = new MetaObjectSpecExample();
		if (StringUtils.isNotBlank(query)) {
			metaObjectSpecExample.createCriteria().andObjectSpecNameLike(SqlUtil.bothLike(query));
		} else {
			metaObjectSpecExample.createCriteria().andObjectSpecCodeIsNotNull();
		}
		List<MetaObjectSpec> objects = metaObjectSpecMapper.selectByExample(metaObjectSpecExample);
		return new PageInfo<MetaObjectSpec>(objects);
	}

	@Transactional(readOnly = true)
	public List<TreeNode> findObjectTreeByName(String name) {
		List<MetaObjectSpec> objectSpecs = findByName(name);
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (MetaObjectSpec objectSpec : objectSpecs) {
			TreeNode treeNode = createTreeNode(objectSpec);
			List<MetaAttrSpec> attrSpecs = findByObjectSpec(objectSpec.getObjectSpecId());
			List<TreeNode> nodes = createNodes(attrSpecs);
			treeNode.setNodes(nodes);
			treeNodes.add(treeNode);
		}
		return treeNodes;
	}

	private List<TreeNode> createNodes(List<MetaAttrSpec> attrSpecs) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (MetaAttrSpec attrSpec : attrSpecs) {
			TreeNode treeNode = new TreeNode();
			treeNode.setText(attrSpec.getName());
			treeNode.setValue(attrSpec.getAttrId().toString());
			treeNode.setTags(TagsUtil.createTags(attrSpec.getAttrId().toString(), attrSpec.getCode()));
			treeNodes.add(treeNode);
		}
		return treeNodes;
	}

	private List<MetaAttrSpec> findByObjectSpec(Long objectSpecId) {
		MetaAttrSpecExample attrSpecExample = new MetaAttrSpecExample();
		attrSpecExample.createCriteria().andObjectSpecIdEqualTo(objectSpecId);
		List<MetaAttrSpec> attrSpecs = metaAttrSpecMapper.selectByExample(attrSpecExample);
		return attrSpecs;
	}

	private TreeNode createTreeNode(MetaObjectSpec objectSpec) {
		TreeNode treeNode = new TreeNode();
		treeNode.setText(objectSpec.getObjectSpecName());
		treeNode.setValue(objectSpec.getObjectSpecId().toString());
		treeNode.setTags(TagsUtil.createTags(objectSpec.getObjectSpecId().toString(), objectSpec.getObjectSpecCode()));
		return treeNode;
	}

	private List<MetaObjectSpec> findByName(String name) {
		MetaObjectSpecExample objectSpecExample = new MetaObjectSpecExample();
		objectSpecExample.createCriteria().andObjectSpecNameLike(SqlUtil.bothLike(name));
		List<MetaObjectSpec> objectSpecs = metaObjectSpecMapper.selectByExample(objectSpecExample);
		return objectSpecs;
	}

}
