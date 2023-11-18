package com.springboot.postgres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.postgres.entity.Employee;
import com.springboot.postgres.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl empService;
	
	@GetMapping
	public List<Employee> findAll(){
		return empService.findAll();
	}
	@PostMapping
	public Employee add(@RequestBody Employee emp){
		return empService.add(emp);
	}
}
