package com.holmesycl.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holmesycl.product.domain.Account;
import com.holmesycl.product.service.AccountService;

@RestController
@RequestMapping("/account")
public class MainController {

	@Autowired
	private AccountService accountService;

	@RequestMapping("/")
	public String main() {
		return "Hello";
	}

	@RequestMapping("/save")
	public Account save() {
		Account account = new Account();
		account.setUsername("u1");
		account.setPassword("p1");
		account.setEmail("1@qq.com");
		accountService.insertAccount(account);

		return account;
	}

}
