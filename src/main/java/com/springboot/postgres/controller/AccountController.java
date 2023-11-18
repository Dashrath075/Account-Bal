package com.springboot.postgres.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.postgres.entity.Account;
import com.springboot.postgres.entity.Customer;
import com.springboot.postgres.service.AccountService;
import com.springboot.postgres.service.CustomerService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	private AccountService accService;
	
	@Autowired
	private CustomerService csService;
	
	@PostMapping("/saveAccount")
	public Account saveAccount(@RequestBody Account ac){
		return accService.saveAccount(ac);
	}
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer cs) {
		return csService.saveCustomer(cs);
	}
	
	@GetMapping("/getAccBalById/{Id}")
	public ResponseEntity<List<Account>> getBalanceById(@RequestParam Long id){
		Optional<Account> bal = accService.getBalanceById(id);
		return new ResponseEntity(bal, HttpStatus.OK);
	}
}
