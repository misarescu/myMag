package com.myMag.SpringBackend.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
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

    public SellerStock() {
    }

    public SellerStock(int quantity, List<Address> addresses, Product product) {
        this.quantity = quantity;
        this.addresses = addresses;
        this.product = product;
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellerStock that = (SellerStock) o;
        return quantity == that.quantity && Objects.equals(id, that.id) && Objects.equals(addresses, that.addresses) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, addresses, product);
    }
}
