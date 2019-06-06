package com.learning;


import com.learning.model.Customer;
import com.learning.service.CustomerService;
import com.learning.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String[] args) {


        CustomerService service = new CustomerServiceImpl();


        System.out.println(service.findAll().get(0).getFirstName());



//        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//       // CustomerService service = appContext.getBean("customerService", CustomerService.class);
//
//
//
//     //   System.out.println(service.findAll().get(0).getFirstName();

    }
}