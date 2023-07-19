package com.myMag.SpringBackend.models;

import com.myMag.SpringBackend.Types.OrderStatus;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private float billedAmount;
    private OrderStatus status;
    @OneToMany
    private List<Product> products;
    @OneToOne
    private PaymentMethod paymentMethod;
    @OneToOne
    private Address billingAddress;
    @OneToOne
    private Address shippingAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Float.compare(order.billedAmount, billedAmount) == 0 && Objects.equals(id, order.id) && status == order.status && Objects.equals(products, order.products) && Objects.equals(paymentMethod, order.paymentMethod) && Objects.equals(billingAddress, order.billingAddress) && Objects.equals(shippingAddress, order.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, billedAmount, status, products, paymentMethod, billingAddress, shippingAddress);
    }

    public Order() {
    }

    public Order(float billedAmount, OrderStatus status, List<Product> products, PaymentMethod paymentMethod, Address billingAddress, Address shippingAddress) {
        this.billedAmount = billedAmount;
        this.status = status;
        this.products = products;
        this.paymentMethod = paymentMethod;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public float getBilledAmount() {
        return billedAmount;
    }

    public void setBilledAmount(float billedAmount) {
        this.billedAmount = billedAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
