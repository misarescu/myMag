package com.myMag.SpringBackend.models.concreteModels;

import com.myMag.SpringBackend.models.baseModels.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class SellerAddress extends Address {
    @ManyToOne(fetch = FetchType.LAZY)
    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
