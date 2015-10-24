package com.holmesycl.product.persistence;

import com.holmesycl.product.domain.Account;

public interface AccountMapper {

	Account getAccountByUsername(String username);

	Account getAccountByUsernameAndPassword(Account account);

	void insertAccount(Account account);

}
