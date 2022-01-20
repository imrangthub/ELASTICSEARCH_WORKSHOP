package com.imranmadbar.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @PostMapping("/saveCustomer")
    public int saveCustomer(@RequestBody List<CustomerEntity> customers) {
        repository.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/findAll")
    public Iterable<CustomerEntity> findAllCustomers() {
        return repository.findAll();
    }

    @GetMapping("/findByFName/{firstName}")
    public List<CustomerEntity> findByFirstName(@PathVariable String firstName) {
        return repository.findByFirstname(firstName);



    }



}
