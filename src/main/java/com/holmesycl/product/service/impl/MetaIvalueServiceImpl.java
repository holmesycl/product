package com.holmesycl.product.service.impl;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.CaseFormat;
import com.google.common.base.Preconditions;
import com.holmesycl.product.domain.meta.MetaIvalue;
import com.holmesycl.product.domain.meta.MetaIvalueAttr;
import com.holmesycl.product.domain.meta.MetaIvalueAttrExample;
import com.holmesycl.product.domain.meta.MetaIvalueAttrRel;
import com.holmesycl.product.domain.meta.MetaIvalueAttrRelExample;
import com.holmesycl.product.domain.meta.MetaIvalueExample;
import com.holmesycl.product.domain.meta.TreeNode;
import com.holmesycl.product.domain.meta.TreeNode.State;
import com.holmesycl.product.persistence.meta.MetaIvalueAttrMapper;
import com.holmesycl.product.persistence.meta.MetaIvalueAttrRelMapper;
import com.holmesycl.product.persistence.meta.MetaIvalueMapper;
import com.holmesycl.product.service.MetaIvalueService;
import com.holmesycl.product.util.ClassPathUtil;
import com.holmesycl.product.util.SqlUtil;
import com.holmesycl.product.util.TagsUtil;

@Service("metaIvalueService")
@Transactional
public class MetaIvalueServiceImpl implements MetaIvalueService {

	@Autowired
	private MetaIvalueMapper metaIvalueMapper;

	@Autowired
	private MetaIvalueAttrMapper metaIvalueAttrMapper;

	@Autowired
	private MetaIvalueAttrRelMapper metaIvalueAttrRelMapper;

	private ThreadLocal<Set<Long>> threadLocal = new ThreadLocal<Set<Long>>();

	@Transactional(readOnly = true)
	public List<TreeNode> findIvalueTreeByName(String name) {
		checkArgument(StringUtils.isNotBlank(name));
		List<MetaIvalue> ivalues = findByName(name);
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (MetaIvalue ivalue : ivalues) {
			TreeNode treeNode = createTreeNode(ivalue);
			List<MetaIvalueAttr> ivalueAttrs = findByObjectSpec(ivalue.getValueId());
			List<TreeNode> nodes = createNodes(ivalueAttrs);
			treeNode.setNodes(nodes);
			treeNodes.add(treeNode);
		}
		return treeNodes;
	}

	@Transactional(readOnly = true)
	public List<TreeNode> findTreeByAttrId(long attrId) {
		List<MetaIvalueAttr> ivalueAttrs = findByAttrId(attrId);
		Set<Long> ivalueIds = new HashSet<Long>();
		for (MetaIvalueAttr ivalueAttr : ivalueAttrs) {
			long ivalueId = ivalueAttr.getValueId();
			ivalueIds.add(ivalueId);
		}
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (long ivalueId : ivalueIds) {
			List<TreeNode> treeNodeList = findIvalueTreeByName(ivalueId + "");
			treeNodes.addAll(treeNodeList);
		}
		return treeNodes;
	}

	public List<MetaIvalue> findByIvalueAttrs(List<MetaIvalueAttr> ivalueAttrs) {
		ivalueAttrs = Preconditions.checkNotNull(ivalueAttrs);
		Set<Long> ivalueIds = new HashSet<Long>();
		for (MetaIvalueAttr ivalueAttr : ivalueAttrs) {
			long ivalueId = ivalueAttr.getValueId();
			ivalueIds.add(ivalueId);
		}
		List<MetaIvalue> values = new ArrayList<MetaIvalue>();
		for (long ivalueId : ivalueIds) {
			List<MetaIvalue> ivalues = findByName(ivalueId + "");
			values.addAll(ivalues);
		}
		return values;
	}

	private List<MetaIvalueAttr> findByAttrId(long attrId) {
		MetaIvalueAttrRelExample metaIvalueAttrRelExample = new MetaIvalueAttrRelExample();
		metaIvalueAttrRelExample.createCriteria().andAttrIdEqualTo(attrId);
		List<MetaIvalueAttrRel> ivalueAttrRels = metaIvalueAttrRelMapper.selectByExample(metaIvalueAttrRelExample);
		List<MetaIvalueAttr> ivalueAttrs = new ArrayList<MetaIvalueAttr>();
		Set<Long> items = new HashSet<Long>();
		if (ivalueAttrRels != null && ivalueAttrRels.size() > 0) {
			for (MetaIvalueAttrRel ivalueAttrRel : ivalueAttrRels) {
				long mappingAttrId = ivalueAttrRel.getMappingAttrId();
				// 加入需要被选择的节点中
				items.add(mappingAttrId);
				MetaIvalueAttr ivalueAttr = metaIvalueAttrMapper.selectByPrimaryKey(mappingAttrId);
				ivalueAttrs.add(ivalueAttr);
			}
		}
		threadLocal.set(items);
		return ivalueAttrs;
	}

	private List<TreeNode> createNodes(List<MetaIvalueAttr> ivalueAttrs) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (MetaIvalueAttr ivalueAttr : ivalueAttrs) {
			TreeNode treeNode = new TreeNode();
			treeNode.setText(ivalueAttr.getAttrCode());
			treeNode.setTags(TagsUtil.createTags(ivalueAttr.getAttrName(), ivalueAttr.getMappingAttrId() + ""));
			// 在需要选择节点中的节点，需要被选择
			Set<Long> items = threadLocal.get();
			if (items != null && items.contains(ivalueAttr.getMappingAttrId())) {
				State nodeState = new State();
				nodeState.setSelected(true);
				treeNode.setState(nodeState);
			}
			treeNodes.add(treeNode);
		}
		return treeNodes;
	}

	private List<MetaIvalueAttr> findByObjectSpec(Long valueId) {
		MetaIvalueAttrExample ivalueAttrExample = new MetaIvalueAttrExample();
		ivalueAttrExample.createCriteria().andValueIdEqualTo(valueId);
		List<MetaIvalueAttr> ivalueAttrs = metaIvalueAttrMapper.selectByExample(ivalueAttrExample);

		List<MetaIvalueAttr> attrs = new ArrayList<MetaIvalueAttr>();
		// 包含待选择的属性时，不需要展示其他属性
		Set<Long> items = threadLocal.get();
		if (items != null && items.size() > 0) {
			for (MetaIvalueAttr ivalueAttr : ivalueAttrs) {
				if (items.contains(ivalueAttr.getMappingAttrId())) {
					attrs.add(ivalueAttr);
				}
			}
		} else {
			attrs = ivalueAttrs;
		}
		return attrs;
	}

	private TreeNode createTreeNode(MetaIvalue ivalue) {
		TreeNode treeNode = new TreeNode();
		treeNode.setText(ClassPathUtil.toUpperCaseTableNameHasLast(ivalue.getClassPath()));
		treeNode.setTags(TagsUtil.createTags(ivalue.getRemark(), ivalue.getValueId() + ""));
		return treeNode;
	}

	private List<MetaIvalue> findByName(String name) {
		MetaIvalueExample metaIvalueExample = new MetaIvalueExample();
		if (NumberUtils.isDigits(name)) {
			metaIvalueExample.createCriteria().andValueIdEqualTo(Long.parseLong(name));
		} else {
			name = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, StringUtils.upperCase(name));
			metaIvalueExample.createCriteria().andClassPathLike(SqlUtil.bothLike(name));
		}
		List<MetaIvalue> ivalues = metaIvalueMapper.selectByExample(metaIvalueExample);
		return ivalues;
	}

}
