package com.holmesycl.product.service;

import java.util.List;

import com.holmesycl.product.domain.meta.TreeNode;

public interface UiTemplateService {
	
	
	public List<TreeNode> findTemplateTreeByName(String name);

}
