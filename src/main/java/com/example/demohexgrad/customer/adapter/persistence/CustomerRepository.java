package com.example.demohexgrad.customer.adapter.persistence;

import com.example.demohexgrad.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByFirstNameStartingWith(String pattern);
}
