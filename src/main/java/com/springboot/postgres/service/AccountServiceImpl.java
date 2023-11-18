package com.springboot.postgres.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.postgres.entity.Account;
import com.springboot.postgres.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accRepo;

	@Override
	public Account saveAccount(Account ac) {
		return accRepo.save(ac);
	}

	@Override
	public Optional<Account> getBalanceById(Long id) {
		Optional<Account> AccBal = accRepo.findById(id);
		return AccBal;
	}
	
}
