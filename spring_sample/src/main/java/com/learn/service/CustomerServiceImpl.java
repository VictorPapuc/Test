package com.learn.service;

import com.learn.model.Customer;
import com.learn.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
