package com.holmesycl.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.holmesycl.product.domain.meta.TreeNode;
import com.holmesycl.product.domain.meta.TreeNode.State;


@Controller
@RequestMapping("/ui/template")
public class UiTemplateController {
	
	@RequestMapping("/home.html")
	public String home(){
		return "meta/template";
	}
	
	@RequestMapping("/tree")
	@ResponseBody
	public List<TreeNode> findTreeByName(String text){
		List<TreeNode> nodes = new ArrayList<TreeNode>();
		TreeNode node1 = new TreeNode();
		node1.setText("节点1");
		nodes.add(node1);
		
		List<TreeNode> cnodes = new ArrayList<TreeNode>();
		TreeNode node11 = new TreeNode();
		node11.setText("节点11");
		State state = new State();
		state.setDisabled(true);
		node11.setState(state);
		cnodes.add(node11);
		node1.setNodes(cnodes);
		
		TreeNode node2 = new TreeNode();
		node2.setText("节点2");
		nodes.add(node2);
		
		TreeNode node3 = new TreeNode();
		node3.setText("节点3");
		nodes.add(node3);
		
		return nodes;
	}

}
