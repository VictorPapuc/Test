package com.learn.service;

import com.learn.model.Customer;
import com.learn.repository.CustomerRepository;
import com.learn.repository.HibernateCustomerRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}