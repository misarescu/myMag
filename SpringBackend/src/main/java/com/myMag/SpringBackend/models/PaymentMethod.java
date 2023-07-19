package com.myMag.SpringBackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

@Entity
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String provider;
    private String details;

    public PaymentMethod() {
    }

    public PaymentMethod(String provider, String details) {
        this.provider = provider;
        this.details = details;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentMethod that = (PaymentMethod) o;
        return Objects.equals(id, that.id) && Objects.equals(provider, that.provider) && Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, provider, details);
    }
}
