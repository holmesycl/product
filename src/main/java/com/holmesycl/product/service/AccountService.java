package com.holmesycl.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.holmesycl.product.domain.Account;
import com.holmesycl.product.persistence.AccountMapper;

@Service
public class AccountService {

	@Autowired
	private AccountMapper accountMapper;

	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}

	public List<Account> getAccount(String username) {
		return accountMapper.getAccountByUsername(username);
	}

	public Account getAccount(String username, String password) {
		Account account = new Account();
		account.setUsername(username);
		account.setPassword(password);
		return accountMapper.getAccountByUsernameAndPassword(account);
	}

	@Transactional
	public void insertAccount(Account account) {
		accountMapper.insertAccount(account);
	}

}
