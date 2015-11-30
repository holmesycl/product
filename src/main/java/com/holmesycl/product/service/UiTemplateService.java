package com.holmesycl.product.service;

import java.util.List;

import com.holmesycl.product.domain.meta.TreeNode;

public interface UiTemplateService {

	/**
	 * 根据模板ID或者模板名称查询模板的树形结构。
	 * 
	 * @param templateIdOrName
	 *            模板ID或者模板名称
	 * @return 模板树形结构数据
	 */
	public List<TreeNode> findTemplateTreeByTemplateIdOrName(String templateIdOrName);

}
