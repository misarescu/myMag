package com.myMag.SpringBackend.models.concreteModels;

import com.myMag.SpringBackend.types.OrderStatus;
import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

// this is named plural because order is a reserved keyword in mysql
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private float billedAmount;
    @Enumerated(EnumType.ORDINAL)
    private OrderStatus orderStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @OneToOne
    private PaymentMethod paymentMethod;

    @OneToOne
    private CustomerShippingAddress customerShippingAddress;
    @OneToOne
    private CustomerBillingAddress customerBillingAddress;

    @OneToMany(mappedBy = "orders")
    private Set<Product> products;

    public Orders() {
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
        return orderStatus;
    }

    public void setStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
