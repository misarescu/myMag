package com.myMag.SpringBackend.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String content;
    private int rating;
//    @OneToOne(mappedBy = "review")
    private Product product;
//    @OneToOne(mappedBy = "review")
    private Seller seller;

    public Review() {
    }

    public Review(String title, String content, int rating, Product product, Seller seller) {
        this.title = title;
        this.content = content;
        this.rating = rating;
        this.product = product;
        this.seller = seller;
    }

    public Review(String title, String content, int rating) {
        this.title = title;
        this.content = content;
        this.rating = rating;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
