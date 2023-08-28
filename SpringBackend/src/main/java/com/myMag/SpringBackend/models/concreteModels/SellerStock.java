package com.myMag.SpringBackend.models.concreteModels;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class SellerStock {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private int quantity;

    @OneToOne
    private Seller seller;

    @OneToMany(mappedBy = "sellerStock")
    private Set<Product> products;

    public SellerStock() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
