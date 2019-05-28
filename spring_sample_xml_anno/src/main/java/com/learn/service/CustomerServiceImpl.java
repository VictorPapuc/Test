package com.learn.service;

import com.learn.model.Customer;
import com.learn.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    private CustomerRepository customerRepository;


    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("we are using constructor injection");
        this.customerRepository = customerRepository;
    }


    // @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {

        System.out.println("WE ARE USING SETTER INJECTION");
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


}