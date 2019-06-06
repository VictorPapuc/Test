package com.learning.repository;

import com.learning.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findall();
}
