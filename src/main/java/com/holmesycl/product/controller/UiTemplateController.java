package com.holmesycl.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.holmesycl.product.domain.meta.TreeNode;
import com.holmesycl.product.service.UiTemplateService;

@Controller
@RequestMapping("/ui/template")
public class UiTemplateController {

	@Autowired
	private UiTemplateService uiTemplateService;

	@RequestMapping("/home.html")
	public String home() {
		return "meta/template";
	}

	/**
	 * 根据模板ID或者模板名称查询模板的树形结构。
	 * 
	 * @param searchText
	 *            模板ID或者模板名称
	 * 
	 * @return 树形结构的JSON格式
	 */
	@RequestMapping("/tree")
	@ResponseBody
	public List<TreeNode> searchAsTree(String searchText) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		treeNodes = uiTemplateService.findTemplateTreeByTemplateIdOrName(searchText);
		return treeNodes;
	}

}
