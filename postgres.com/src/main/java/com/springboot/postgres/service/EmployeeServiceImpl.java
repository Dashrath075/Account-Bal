package com.springboot.postgres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.postgres.entity.Employee;
import com.springboot.postgres.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	private EmployeeRepository empRepo;
    
	public List<Employee> findAll(){
		return empRepo.findAll();
	}
	
	public Employee add(Employee emp) {
		return empRepo.saveAndFlush(emp);
	}
}
