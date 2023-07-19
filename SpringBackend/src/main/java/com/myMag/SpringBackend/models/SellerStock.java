package com.myMag.SpringBackend.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class SellerStock {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int quantity;
    @OneToMany
    private List<Address> addresses;
    @OneToOne
    private Product product;
}
