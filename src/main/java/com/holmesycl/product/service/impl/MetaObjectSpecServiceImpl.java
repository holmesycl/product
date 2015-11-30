package com.holmesycl.product.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.base.Preconditions;
import com.holmesycl.product.domain.meta.MetaAttrSpec;
import com.holmesycl.product.domain.meta.MetaAttrSpecExample;
import com.holmesycl.product.domain.meta.MetaObjectSpec;
import com.holmesycl.product.domain.meta.MetaObjectSpecExample;
import com.holmesycl.product.domain.meta.TreeNode;
import com.holmesycl.product.domain.meta.TreeNode.State;
import com.holmesycl.product.domain.meta.UiComponentElement;
import com.holmesycl.product.domain.meta.UiComponentElementExample;
import com.holmesycl.product.persistence.meta.MetaAttrSpecMapper;
import com.holmesycl.product.persistence.meta.MetaObjectSpecMapper;
import com.holmesycl.product.persistence.meta.UiComponentElementMapper;
import com.holmesycl.product.service.MetaObjectSpecService;
import com.holmesycl.product.util.DataType;
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

	@Autowired
	private UiComponentElementMapper uiComponentElementMapper;

	private ThreadLocal<Long> threadLocal = new ThreadLocal<Long>();

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
	public List<TreeNode> findObjectTreeByObjectIdOrName(String objectIdOrName) {
		List<MetaObjectSpec> objectSpecs = findByObjectOrName(objectIdOrName);
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

	@Transactional(readOnly = true)
	public List<TreeNode> findTreeByComponent(long componentId) {
		MetaObjectSpec objectSpec = findObjectByComponent(componentId);
		List<TreeNode> treeNodes = findObjectTreeByObjectIdOrName(objectSpec.getObjectSpecId().toString());
		return treeNodes;
	}

	/**
	 * 根据组件ID获取元数据对象。
	 * 
	 * @param componentId
	 *            组件ID
	 * 
	 * @return 元素据对象
	 */
	private MetaObjectSpec findObjectByComponent(long componentId) {

		UiComponentElementExample componentElementExample = new UiComponentElementExample();
		componentElementExample.createCriteria().andUiComponentIdEqualTo(componentId);

		List<UiComponentElement> componentElements = uiComponentElementMapper.selectByExample(componentElementExample);
		Preconditions.checkState(componentElements != null && componentElements.size() == 1, "根据组件ID：%s获取关联关系错误！", componentId);

		UiComponentElement componentElement = componentElements.get(0);
		componentElement = Preconditions.checkNotNull(componentElement);

		MetaAttrSpec attrSpec = metaAttrSpecMapper.selectByPrimaryKey(componentElement.getAttrId());
		attrSpec = Preconditions.checkNotNull(attrSpec);
		threadLocal.set(attrSpec.getAttrId());

		MetaObjectSpec objectSpec = metaObjectSpecMapper.selectByPrimaryKey(attrSpec.getObjectSpecId());

		return objectSpec;
	}

	private List<TreeNode> createNodes(List<MetaAttrSpec> attrSpecs) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (MetaAttrSpec attrSpec : attrSpecs) {
			TreeNode treeNode = new TreeNode();
			treeNode.setText(attrSpec.getName());
			treeNode.setValue(attrSpec.getAttrId().toString());
			Long existAttr = threadLocal.get();
			if (existAttr != null && existAttr.equals(attrSpec.getAttrId())) {
				State state = new State();
				state.setSelected(true);
				treeNode.setState(state);
			}
			DataType dataType = DataType.createByOrginName(attrSpec.getDataType());
			// 对于引用数据类型，需要加载元数据对象
			if (dataType == DataType.OBJECT || dataType == DataType.LIST) {
				Long refObjectSpecId = attrSpec.getRefObjectSpecId();
				List<MetaAttrSpec> refAttrs = findByObjectSpec(refObjectSpecId);
				List<TreeNode> refNodes = createNodes(refAttrs);
				treeNode.setNodes(refNodes);
			}
			treeNode.setTags(TagsUtil.createTags(attrSpec.getAttrId().toString(), dataType.toLocalString()));
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
		treeNode.setTags(TagsUtil.createTags(objectSpec.getObjectSpecId().toString()));
		return treeNode;
	}

	/**
	 * 
	 * @param objectIdOrName
	 * @return
	 */
	private List<MetaObjectSpec> findByObjectOrName(String objectIdOrName) {
		MetaObjectSpecExample objectSpecExample = new MetaObjectSpecExample();
		if (StringUtils.isNumeric(objectIdOrName)) {
			objectSpecExample.createCriteria().andObjectSpecIdEqualTo(Long.parseLong(objectIdOrName));
		} else {
			objectSpecExample.createCriteria().andObjectSpecNameLike(SqlUtil.bothLike(objectIdOrName));
		}
		List<MetaObjectSpec> objectSpecs = metaObjectSpecMapper.selectByExample(objectSpecExample);
		return objectSpecs;
	}

}
