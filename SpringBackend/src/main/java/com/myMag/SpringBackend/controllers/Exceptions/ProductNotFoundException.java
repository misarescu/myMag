package com.myMag.SpringBackend.controllers.Exceptions;

import java.util.UUID;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(UUID id){
        super("Could not find product with id:" + id);
    }
}
