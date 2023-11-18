package com.springboot.postgres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.postgres.entity.Customer;
import com.springboot.postgres.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository csRepo;

	@Override
	public Customer saveCustomer(Customer cs) {
		return csRepo.save(cs);
	}

}
