package com.holmesycl.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.holmesycl.product.domain.meta.TreeNode;
import com.holmesycl.product.service.MetaIvalueService;

@RequestMapping("/meta/ivalue")
@Controller
public class MetaIvalueController {

	@Autowired
	private MetaIvalueService metaIvalueService;

	@RequestMapping("/home.html")
	public String view() {
		return "meta/ivalue";
	}

	@RequestMapping("/tree")
	@ResponseBody
	public List<TreeNode> findTreeByName(String name) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		treeNodes = metaIvalueService.findIvalueTreeByName(name);
		return treeNodes;
	}
	
	@RequestMapping("/tree/attr")
	@ResponseBody
	public List<TreeNode> findTreeByAttrId(long attrId) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		treeNodes = metaIvalueService.findTreeByAttrId(attrId);
		return treeNodes;
	}

}
