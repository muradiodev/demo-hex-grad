package com.example.demohexgrad.customer.adapter.persistence;

import com.example.demohexgrad.customer.application.port.out.CustomerPort;
import com.example.demohexgrad.customer.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
class CustomerAdapter implements CustomerPort {

    private final CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findByFirstNameStartingWith(String pattern) {
        return customerRepository.findByFirstNameStartingWith(pattern);
    }
}