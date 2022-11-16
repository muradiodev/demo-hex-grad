package com.example.demohexgrad.product.application.service;

import com.example.demohexgrad.product.application.port.in.ExternalFakeProductUseCase;
import com.example.demohexgrad.product.application.port.in.ProductUseCase;
import com.example.demohexgrad.product.application.port.out.ExternalFakeProductPort;
import com.example.demohexgrad.product.application.port.out.ProductPort;
import com.example.demohexgrad.product.domain.Product;
import com.example.demohexgrad.product.dto.FakeProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService implements ProductUseCase, ExternalFakeProductUseCase {

    private final ProductPort productPort;
    private final ExternalFakeProductPort fakeProductPort;

    @Override
    public Product save(Product product) {
        return productPort.save(product);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productPort.findById(id);
    }

    @Override
    public List<FakeProductDTO> fetchAllFakeProducts() {
        return fakeProductPort.fetchAllFakeProducts();
    }
}

