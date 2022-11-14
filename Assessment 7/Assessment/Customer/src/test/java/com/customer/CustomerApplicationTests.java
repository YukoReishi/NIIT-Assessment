package com.customer;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CustomerApplicationTests {

	@Autowired
	private CustomerRepository repository;

	@Test
	public void registerCustomerTest(){
		Customer authenticationRequest = new Customer(1,"Sandeep","87326833","Sandeep@gmail.com");

		assertNotNull(repository.findById(1L));

	}

}
