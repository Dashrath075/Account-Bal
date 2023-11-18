package com.springboot.postgres.service;

import java.util.Optional;

import com.springboot.postgres.entity.Account;

public interface AccountService {
	Account saveAccount(Account ac);

	Optional<Account> getBalanceById(Long id);
}
