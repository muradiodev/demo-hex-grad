package com.example.demohexgrad.product.adapter.persistence;

import com.example.demohexgrad.product.application.port.out.ProductPort;
import com.example.demohexgrad.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductAdapter implements ProductPort {
    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }
}
