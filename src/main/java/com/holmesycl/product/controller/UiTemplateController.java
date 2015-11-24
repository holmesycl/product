package com.holmesycl.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ui/template")
public class UiTemplateController {
	
	@RequestMapping("/home.html")
	public String home(){
		return "meta/template";
	}

}
