package com.example.demohexgrad.product.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
public class ProductDTO {

    private Integer id;
    private String catalogName;
    private BigDecimal price;
    private Date createdAt;

}