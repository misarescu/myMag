package com.myMag.SpringBackend.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Warranty {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate buyDate;
    private LocalDate expiryDate;
    @OneToOne
    private Product product;


}
