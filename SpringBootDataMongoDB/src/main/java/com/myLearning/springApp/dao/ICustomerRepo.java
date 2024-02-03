package com.myLearning.springApp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myLearning.springApp.bo.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {

}
