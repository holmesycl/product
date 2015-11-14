package com.holmesycl.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.holmesycl.product.domain.meta.MetaObjectSpec;
import com.holmesycl.product.service.MetaObjectSpecService;

@Controller
@RequestMapping("/meta/object")
public class MetaObjectSpecController {

	@Autowired
	private MetaObjectSpecService metaObjectSpecService;

	@RequestMapping("/save")
	@ResponseBody
	public MetaObjectSpec save(String name) {
		MetaObjectSpec object = new MetaObjectSpec();
		object.setObjectSpecId(1231231L);
		object.setObjectSpecCode("Test");
		object.setObjectSpecName("Test_T");
		metaObjectSpecService.save(object);
		return object;
	}
	
	
	@RequestMapping("/home.html")
	public String view(){
		return "meta/object";
	}
	
	@RequestMapping("/search")
	@ResponseBody
	public PageInfo<MetaObjectSpec> page(Page<MetaObjectSpec> page){
		return metaObjectSpecService.page(page);
	}

}
