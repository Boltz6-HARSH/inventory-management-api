package com.harsh.inventory.service;

import com.harsh.inventory.model.Product;
import com.harsh.inventory.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public boolean isLowStock(Long id) {
        Product product = repository.findById(id).orElseThrow();
        return product.getQuantity() < 5;
    }
}