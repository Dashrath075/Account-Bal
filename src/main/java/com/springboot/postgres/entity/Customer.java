package com.springboot.postgres.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {
	@Id
	private Long Customer_id;
	private String Customer_Name;
}
