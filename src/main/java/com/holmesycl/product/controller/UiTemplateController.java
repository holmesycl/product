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

	@RequestMapping("/tree")
	@ResponseBody
	public List<TreeNode> findTreeByName(String name) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		treeNodes = uiTemplateService.findTemplateTreeByName(name);
		return treeNodes;
	}

}
