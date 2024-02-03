package com.myLearning.springApp.bo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	private String id;//created by mongodb itself	
	
	private Integer customerNumber;
	private String name;
	private String city;
	private String state;
	private Integer billAmount;
	
	public Customer(Integer customerNumber, String name, String city, String state,Integer billAmount) {
		super();
		this.customerNumber = customerNumber;
		this.name = name;
		this.city = city;
		this.state = state;
		this.billAmount=billAmount;
	}
	
}
