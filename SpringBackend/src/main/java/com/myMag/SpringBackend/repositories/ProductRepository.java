package com.myMag.SpringBackend.repositories;

import com.myMag.SpringBackend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> { }
