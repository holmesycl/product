package com.holmesycl.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holmesycl.product.domain.meta.MetaObjectSpec;
import com.holmesycl.product.service.MetaObjectSpecService;

@RestController
@RequestMapping("/meta/object")
public class MetaObjectSpecController {

	@Autowired
	private MetaObjectSpecService metaObjectSpecService;

	@RequestMapping("/save")
	public MetaObjectSpec save(String name) {
		MetaObjectSpec object = new MetaObjectSpec();
		object.setObjectSpecId(1231231L);
		object.setObjectSpecCode("Test");
		object.setObjectSpecName("Test_T");
		metaObjectSpecService.save(object);
		return object;
	}

}
