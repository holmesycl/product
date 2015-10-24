package com.holmesycl.product.persistence;

import java.util.List;

import com.holmesycl.product.domain.Account;

public interface AccountMapper {

	List<Account> getAccountByUsername(String username);

	Account getAccountByUsernameAndPassword(Account account);

	void insertAccount(Account account);

}
