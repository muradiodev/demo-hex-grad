package com.example.demohexgrad.product.application.port.in;

import com.example.demohexgrad.product.dto.FakeProductDTO;

import java.util.List;

public interface ExternalFakeProductUseCase {

    List<FakeProductDTO> fetchAllFakeProducts();
}
