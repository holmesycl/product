package com.holmesycl.product.service;

import java.util.List;

import com.holmesycl.product.domain.meta.TreeNode;

public interface MetaIvalueService {

	List<TreeNode> findIvalueTreeByName(String name);

	
	List<TreeNode> findTreeByAttrId(long attrId);

}
