package com.holmesycl.product.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.holmesycl.product.domain.meta.MetaObjectSpec;
import com.holmesycl.product.domain.meta.TreeNode;
import com.holmesycl.product.util.PageParam;

public interface MetaObjectSpecService {

	public void save(MetaObjectSpec record);

	public PageInfo<MetaObjectSpec> page(PageParam pageParam, String query);

	public List<TreeNode> findObjectTreeByObjectIdOrName(String objectIdOrName);

	public List<TreeNode> findTreeByComponent(long componentId);

}
