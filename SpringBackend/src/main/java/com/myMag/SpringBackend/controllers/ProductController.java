package com.myMag.SpringBackend.controllers;

import com.myMag.SpringBackend.DTO.ProductDTO;
import com.myMag.SpringBackend.controllers.Exceptions.ProductNotFoundException;
import com.myMag.SpringBackend.models.Product;
import com.myMag.SpringBackend.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String stringId) {
        UUID id = UUID.fromString(stringId);
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PostMapping
    public Product postProduct(@RequestBody ProductDTO newProductDTO) {
        UUID id = UUID.randomUUID();
        Product newProduct = new Product(id, newProductDTO.getName(), newProductDTO.getDescription());
        return productRepository.save(newProduct);
    }

    @PutMapping("/{id}")
    public Product putProduct(@PathVariable("id") String stringId, @RequestBody ProductDTO newProductDTO) {
        UUID id = UUID.fromString(stringId);
        Product newProduct = new Product(id, newProductDTO.getName(), newProductDTO.getDescription());
        return productRepository.findById(id)
                .map(product -> {
                    product.setName(newProduct.getName());
                    product.setDescription(newProduct.getDescription());
                    return productRepository.save(product);
                })
                .orElseGet(() -> {
                    newProduct.setId(id);
                    return productRepository.save(newProduct);
                });
    }

    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable("id") String stringId) {
        UUID id = UUID.fromString(stringId);
        Product deletedProduct = productRepository
                .findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        productRepository.deleteById(id);
        return deletedProduct;
    }
}
