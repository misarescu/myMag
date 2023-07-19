package com.myMag.SpringBackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private final String username;
    private final String password; // this field will be encrypted with BCryptPasswordEncoder via Spring Security

    public Seller(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
