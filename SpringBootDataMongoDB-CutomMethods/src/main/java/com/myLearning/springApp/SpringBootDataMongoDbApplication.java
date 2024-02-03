package com.myLearning.springApp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.myLearning.springApp.bo.Customer;
import com.myLearning.springApp.dto.CustomerDTO;
import com.myLearning.springApp.generator.IDGenerator;
import com.myLearning.springApp.service.CustomerServiceImpl;

@SpringBootApplication
public class SpringBootDataMongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SpringBootDataMongoDbApplication.class, args);		
		
		CustomerServiceImpl service = context.getBean(CustomerServiceImpl.class);
//		
//		CustomerDTO dto = new CustomerDTO(IDGenerator.generateID(),94,"Gauri","Gaziabad","UttarPradesh");
//		System.out.println(service.registerCustomer(dto));		
//		
//		CustomerDTO dt = new CustomerDTO("Suresh","ABC");
//		System.out.println(service.registerCustomer(dt));
//		
//		
//		CustomerDTO cdto = new CustomerDTO();
//		cdto.setCity("Purulia");
//		cdto.setId("1212");
//		cdto.setState("Jharkhand");
//		System.out.println(service.registerCustomer(cdto));
//		
//		
//		System.out.println(service.registerCustomer(dt));		
//		
//		
//		List<Customer> list = service.getAllCustomers();
//		list.forEach(i->System.out.println(i));		
//		
//		System.out.println(service.removeDocument("65b64931fbad850ee07cacc7"));	
		
		CustomerDTO cdto = new CustomerDTO();
		cdto.setCity("Purulia");
		cdto.setId("1212");
		cdto.setState("Jharkhand");
		cdto.setBillAmount(100);
		System.out.println(service.registerCustomer(cdto));		
		
		
		List<Customer> list = service.findByBillAmountBetween(10,900);
		list.forEach(i->System.out.println(i));
		
		context.close();		
	}

}
