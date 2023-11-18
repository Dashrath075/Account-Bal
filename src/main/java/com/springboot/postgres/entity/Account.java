package com.springboot.postgres.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Account {
   @Id
   private Long ID;
   private Integer ACCNUM;
   private String ACTCCY;
   private String ACTYPE;
   private Float BALANCE;
   @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="CUST_ID")
   private Customer Customer_id;
}
