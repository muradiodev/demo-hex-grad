package com.example.demohexgrad.product.application.port.out;

import com.example.demohexgrad.product.dto.FakeProductDTO;

import java.util.List;

public interface ExternalFakeProductPort {

    List<FakeProductDTO> fetchAllFakeProducts();
}

