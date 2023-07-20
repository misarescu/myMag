package com.myMag.SpringBackend.models.concreteModels;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String userName;
    private String password;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CustomerBillingAddress> billingAddresses;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CustomerShippingAddress> shippingAddresses;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Orders> orders;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Review> reviews;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Orders> warranties;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name="favourite_customer_product",
        joinColumns = @JoinColumn(name="customer_id"),
        inverseJoinColumns = @JoinColumn(name="product_id")
    )
    private Set<Product> favouriteProducts;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name="cart_customer_product",
        joinColumns = @JoinColumn(name="customer_id"),
        inverseJoinColumns = @JoinColumn(name="product_id")
    )
    private Set<Product> cartProducts;

    public Customer() {
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
}
