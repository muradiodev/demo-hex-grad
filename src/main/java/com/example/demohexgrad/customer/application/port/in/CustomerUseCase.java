package com.example.demohexgrad.customer.application.port.in;

import com.example.demohexgrad.customer.domain.Customer;

import java.util.List;

public interface CustomerUseCase {

    Customer save(Customer customer);

    List<Customer> findByFirstNameStartingWith(String pattern);
}
