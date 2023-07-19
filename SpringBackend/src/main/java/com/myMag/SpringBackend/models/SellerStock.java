package com.myMag.SpringBackend.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class SellerStock {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int quantity;
    @OneToMany
    private Address address;
    @OneToOne
    private Product product;
}
