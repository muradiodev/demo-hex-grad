package com.example.demohexgrad.customer.application.port.out;

import com.example.demohexgrad.customer.domain.Customer;

import java.util.List;

public interface CustomerPort {

    Customer save(Customer customer);

    List<Customer> findByFirstNameStartingWith(String pattern);
}
