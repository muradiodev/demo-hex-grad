package com.example.demohexgrad.customer.adapter.web;

import com.example.demohexgrad.customer.application.port.in.CustomerUseCase;
import com.example.demohexgrad.customer.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/customer")
public class CustomerController {

    private final CustomerUseCase customerUseCase;

    @PostMapping
    public ResponseEntity<Customer> persist(@RequestBody Customer customer) {
        Customer persistedCustomer = customerUseCase.save(customer);
        return new ResponseEntity<>(persistedCustomer, HttpStatus.CREATED);
    }

    @GetMapping(value = "/by-first-name-starting-with")
    public ResponseEntity<List<Customer>> findByNameStartingWith(@RequestParam(value = "pattern") String pattern) {
        List<Customer> customers = customerUseCase.findByFirstNameStartingWith(pattern);
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}
