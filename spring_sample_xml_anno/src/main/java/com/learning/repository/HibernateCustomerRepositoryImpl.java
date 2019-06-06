package com.learning.repository;

import com.learning.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    @Override
    public List<Customer> findall() {

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Ionut");
        customer.setLastName("Avram");

        customers.add(customer);

        return customers;
    }
}
