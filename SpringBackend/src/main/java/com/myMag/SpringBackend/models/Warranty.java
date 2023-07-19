package com.myMag.SpringBackend.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Warranty {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate buyDate;
    private LocalDate expiryDate;
    @OneToOne
    private Product product;

    public Warranty() {
    }

    public Warranty(LocalDate buyDate, LocalDate expiryDate, Product product) {
        this.buyDate = buyDate;
        this.expiryDate = expiryDate;
        this.product = product;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
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
        Warranty warranty = (Warranty) o;
        return Objects.equals(id, warranty.id) && Objects.equals(buyDate, warranty.buyDate) && Objects.equals(expiryDate, warranty.expiryDate) && Objects.equals(product, warranty.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, buyDate, expiryDate, product);
    }
}
