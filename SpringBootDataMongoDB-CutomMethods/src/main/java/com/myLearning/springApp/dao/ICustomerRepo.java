package com.myLearning.springApp.dao;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.myLearning.springApp.bo.Customer;


public interface ICustomerRepo extends MongoRepository<Customer, String> {	

	// findByProperty
	public List<Customer> findByName(String name);

	public List<Customer> findByCity(String city);

	public List<Customer> findByState(String state);

	// Is , Equals
	// findByFirstName , findByFirstNameIs , findByFirstNameEquals
	public List<Customer> findByNameIs(String name);

	// or
	public List<Customer> findByNameOrCity(String name, String city);

	// And
	public List<Customer> findByNameAndCity(String name, String city);

	// GreaterThan
	public List<Customer> findByBillAmountGreaterThan(Integer billAmount);

	// GreaterThanEqual
	public List<Customer> findByBillAmountGreaterThanEqual(Integer billAmount);

	// LessThan
	public List<Customer> findByPriceLessThan(Integer price);

	// LessThanEqual
	public List<Customer> findByBillAmountLessThanEqual(Integer billAmount);

	// Between
	public List<Customer> findByBillAmountBetween(Integer min, Integer max);
	
	// After
	public List<Customer> findByBillAmountAfter(Integer billAmount);

	// Before
	public List<Customer> findByBillAmountBefore(Integer billAmount);

	// IsNull
	// IsNull, Null
	public List<Customer> findByNameNull();

	// IsNotNull, NotNull
	List<Customer> findByNameIsNotNull();

	List<Customer> findByNameNotNull();

}
