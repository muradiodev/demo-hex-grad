package com.example.demohexgrad.product.application.port.out;

import com.example.demohexgrad.product.domain.Product;

import java.util.Optional;

public interface ProductPort {

    Product save(Product product);

    Optional<Product> findById(Integer id);
}
