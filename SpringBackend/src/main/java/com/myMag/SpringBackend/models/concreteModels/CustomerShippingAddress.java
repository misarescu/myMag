package com.myMag.SpringBackend.models.concreteModels;

import com.myMag.SpringBackend.models.baseModels.Address;
import com.myMag.SpringBackend.models.concreteModels.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerShippingAddress extends Address {
    @ManyToOne(fetch= FetchType.LAZY)
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
