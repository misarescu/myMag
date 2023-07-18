package com.myMag.SpringBackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

@Entity
public class Spec {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private boolean isString;
    private String stringValue;
    private float numberValue;

    public Spec() {
    }

    public Spec(UUID id, String name, boolean isString, String stringValue, float numberValue) {
        this.id = id;
        this.name = name;
        this.isString = isString;
        this.stringValue = stringValue;
        this.numberValue = numberValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spec spec = (Spec) o;
        return isString == spec.isString && Float.compare(spec.numberValue, numberValue) == 0 && Objects.equals(id, spec.id) && Objects.equals(name, spec.name) && Objects.equals(stringValue, spec.stringValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isString, stringValue, numberValue);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isString() {
        return isString;
    }

    public void setString(boolean string) {
        isString = string;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public float getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(float numberValue) {
        this.numberValue = numberValue;
    }
}
