package com.example.demohexgrad.customer.application.service;

import com.example.demohexgrad.customer.application.port.in.CustomerUseCase;
import com.example.demohexgrad.customer.application.port.out.CustomerPort;
import com.example.demohexgrad.customer.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService implements CustomerUseCase {

    private final CustomerPort customerPort;


    @Override
    public Customer save(Customer customer) {
        return customerPort.save(customer);
    }

    @Override
    public List<Customer> findByFirstNameStartingWith(String pattern) {
        return customerPort.findByFirstNameStartingWith(pattern);
    }
}
