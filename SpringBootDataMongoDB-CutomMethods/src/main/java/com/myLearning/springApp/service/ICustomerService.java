package com.myLearning.springApp.service;

import java.util.List;

import com.myLearning.springApp.bo.Customer;
import com.myLearning.springApp.dto.CustomerDTO;

public interface ICustomerService {
	
	public String registerCustomer(CustomerDTO dto);

	
	public List<Customer> getAllCustomers();
	
	
	public String removeDocument(String id);
	
	//custom methods	
	public List<Customer> findByBillAmountBetween(Integer min, Integer max);
	
	
}
