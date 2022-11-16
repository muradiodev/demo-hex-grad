package com.example.demohexgrad.product.application.port.in;

import com.example.demohexgrad.product.domain.Product;

import java.util.Optional;

public interface ProductUseCase {
    Product save(Product product);

    Optional<Product> findById(Integer id);
}
