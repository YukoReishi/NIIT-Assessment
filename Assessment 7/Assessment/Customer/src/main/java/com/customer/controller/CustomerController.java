package com.customer.controller;

import com.customer.model.Customer;
import com.customer.model.OrderDTO;
import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PostMapping("/placeOrder/{id}")
    public ResponseEntity PlaceOrder(@PathVariable("id") long id, @RequestBody OrderDTO orderDTO) throws JsonProcessingException {
        Optional<Customer> customer = customerService.viewCustomerById(id);

        orderDTO.setName(customer.get().getName());
        ;

        String response = null;
        String detailBody = getBody(orderDTO);
        System.out.println(detailBody);
        HttpHeaders detailHeaders = getHeaders();
        HttpEntity<String> addDetailEntity = new HttpEntity<String>(detailBody, detailHeaders);
        try{
            ResponseEntity<String> detailResponse = restTemplate.exchange("http://localhost:9001/Order/addOrder", HttpMethod.POST,addDetailEntity, String.class);
            System.out.println("in try");
            if (detailResponse.getStatusCode().equals(HttpStatus.OK)) {
                response= detailResponse.getBody();
                System.out.println("in if "+response);
            }
        }catch (Exception e){
            System.out.println("in exception");
            return ResponseEntity.ok(e.getMessage());
        }
        return ResponseEntity.ok(response);

    }

    @GetMapping("/viewCustomer")
    public List<Customer> viewCustomer(){
        return customerService.viewCustomer();
    }

    @PutMapping("/updateCustomer/{cusid}")
    public Customer updateCustomer(@PathVariable("cusid") long cusid, Customer customer){
        return customerService.updateCustomer(cusid, customer);
    }

    @DeleteMapping("/deleteCustomer/{cusid}")
    public void deleteCustomer(@PathVariable("cusid") long cusid){
        customerService.deleteCustomer(cusid);
    }

    private String getBody(final OrderDTO orderDTO) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(orderDTO);
    }

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return headers;
    }
}

