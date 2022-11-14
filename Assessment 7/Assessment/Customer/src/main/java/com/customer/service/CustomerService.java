package com.customer.service;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

//    public String PlaceOrder()

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Optional<Customer> viewCustomerById(long id){
        return customerRepository.findById(id);
    }

    public List<Customer> viewCustomer(){
        return customerRepository.findAll();
    }

    public Customer updateCustomer(long cusid, Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomer(long cusid){
        customerRepository.deleteById(cusid);
    }
}
