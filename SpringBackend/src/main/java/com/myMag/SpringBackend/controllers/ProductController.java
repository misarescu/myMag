package com.myMag.SpringBackend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
//    private final ProductRepository productRepository;
//
//    public ProductController(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @GetMapping
//    public List<Product> getAll() {
//        return productRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Product getProduct(@PathVariable("id") String stringId) {
//        UUID id = UUID.fromString(stringId);
//        return productRepository.findById(id)
//                .orElseThrow(() -> new ProductNotFoundException(id));
//    }
//
//    @PostMapping
//    public Product postProduct(@RequestBody ProductDTO newProductDTO) {
////        UUID id = UUID.randomUUID();
//        Product newProduct = new Product(
//                newProductDTO.getName(),
//                newProductDTO.getDescription(),
//                newProductDTO.getPrice(),
//                newProductDTO.getDiscount(),
//                newProductDTO.getRating(),
//                newProductDTO.getQuantity());
//        return productRepository.save(newProduct);
//    }
//
//    @PutMapping("/{id}")
//    public Product putProduct(@PathVariable("id") String stringId, @RequestBody ProductDTO newProductDTO) {
//        UUID id = UUID.fromString(stringId);
//        Product newProduct = new Product(
//                newProductDTO.getName(),
//                newProductDTO.getDescription(),
//                newProductDTO.getPrice(),
//                newProductDTO.getDiscount(),
//                newProductDTO.getRating(),
//                newProductDTO.getQuantity());
//        return productRepository.findById(id)
//                .map(product -> {
//                    product.setName(newProduct.getName());
//                    product.setDescription(newProduct.getDescription());
//                    return productRepository.save(product);
//                })
//                .orElseGet(() -> {
//                    newProduct.setId(id);
//                    return productRepository.save(newProduct);
//                });
//    }
//
//    @DeleteMapping("/{id}")
//    public Product deleteProduct(@PathVariable("id") String stringId) {
//        UUID id = UUID.fromString(stringId);
//        Product deletedProduct = productRepository
//                .findById(id)
//                .orElseThrow(() -> new ProductNotFoundException(id));
//        productRepository.deleteById(id);
//        return deletedProduct;
//    }
}
