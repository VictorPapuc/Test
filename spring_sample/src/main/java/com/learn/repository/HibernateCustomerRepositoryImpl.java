package com.learn.repository;

import com.learn.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstname("Brian");
        customer.setLastname("Hansen");
        customers.add(customer);

        return customers;
    }


}


