package com.example.demohexgrad.product.domain;

import com.example.demohexgrad.customer.domain.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "catalog_name")
    private String catalogName;

    @Column
    private BigDecimal price;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
