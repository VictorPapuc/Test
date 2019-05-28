package com.learn.repository;

import com.learn.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    @Value("${dbusername}")
    private String dbusername;

//    public void setDbusername(String dbusername) {
//        this.dbusername = dbusername;
//    }


    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        System.out.println(dbusername);
        Customer customer = new Customer();

        customer.setFirstname("Brian");
        customer.setLastname("Hansen");

        customers.add(customer);

        return customers;
    }

}


