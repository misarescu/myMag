package com.myMag.SpringBackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.UUID;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String userName;
    private String password; // this field will be encrypted with BCryptPasswordEncoder via Spring Security

    private List<Address> billingAddresses;
    private List<Address> shippingAddresses;
    private List<PaymentMethod> paymentMethods;
    private List<Product> favourites;
    private List<Product> cart;
    private List<Review> productReviews;
}
