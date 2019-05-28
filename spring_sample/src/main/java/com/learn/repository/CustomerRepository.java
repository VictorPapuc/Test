package com.learn.repository;

import com.learn.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
