package com.myLearning.springApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import com.myLearning.springApp.bo.Customer;
import com.myLearning.springApp.dao.ICustomerRepo;
import com.myLearning.springApp.dto.CustomerDTO;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;

	@Override
	public String registerCustomer(CustomerDTO dto) {
		Customer customer = new Customer();
		BeanUtils.copyProperties(dto, customer);
		Example<Customer> example = Example.of(customer);
		if(!repo.exists(example))
		repo.save(customer);
		else {
			return "Data already existed!!";
		}
		return "Data saved";
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	@Override
	public String removeDocument(String  id) {		
		Optional<Customer> customer = repo.findById(id);
		
		if(customer.isEmpty())
			return "Data not present";
		if(repo.existsById(id))
		repo.deleteById(id);
		else {
			System.out.println("Data not deleted ");
		}
		return "data deleted";
	}

}
