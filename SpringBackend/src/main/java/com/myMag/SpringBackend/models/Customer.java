package com.myMag.SpringBackend.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String userName;
    private String password; // this field will be encrypted with BCryptPasswordEncoder via Spring Security
    @OneToMany
    private List<Address> billingAddresses;
    @OneToMany
    private List<Address> shippingAddresses;
    @OneToMany
    private List<PaymentMethod> paymentMethods;
    @OneToMany
    private List<Product> favourites;
    @OneToMany
    private List<Product> cart;
    @OneToMany
    private List<Review> productReviews;

    public Customer(String userName, String password, List<Address> billingAddresses, List<Address> shippingAddresses, List<PaymentMethod> paymentMethods, List<Product> favourites, List<Product> cart, List<Review> productReviews) {
        this.userName = userName;
        this.password = password;
        this.billingAddresses = billingAddresses;
        this.shippingAddresses = shippingAddresses;
        this.paymentMethods = paymentMethods;
        this.favourites = favourites;
        this.cart = cart;
        this.productReviews = productReviews;
    }

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
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

    public List<Address> getBillingAddresses() {
        return billingAddresses;
    }

    public void setBillingAddresses(List<Address> billingAddresses) {
        this.billingAddresses = billingAddresses;
    }

    public List<Address> getShippingAddresses() {
        return shippingAddresses;
    }

    public void setShippingAddresses(List<Address> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public List<Product> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<Product> favourites) {
        this.favourites = favourites;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public List<Review> getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(List<Review> productReviews) {
        this.productReviews = productReviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(userName, customer.userName) && Objects.equals(password, customer.password) && Objects.equals(billingAddresses, customer.billingAddresses) && Objects.equals(shippingAddresses, customer.shippingAddresses) && Objects.equals(paymentMethods, customer.paymentMethods) && Objects.equals(favourites, customer.favourites) && Objects.equals(cart, customer.cart) && Objects.equals(productReviews, customer.productReviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password, billingAddresses, shippingAddresses, paymentMethods, favourites, cart, productReviews);
    }
}
