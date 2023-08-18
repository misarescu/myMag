package com.myMag.SpringBackend.models.concreteModels;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String userName;
    private String password;
    private float rating;

    @OneToMany(mappedBy = "seller")
    private Set<SellerAddress> addresses;

    @OneToMany(mappedBy = "seller")
    private Set<Review> reviews;

    @OneToMany(mappedBy = "seller")
    private Set<PaymentMethod> paymentMethods;

    public Seller() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
