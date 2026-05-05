package com.harsh.inventory.controller;

import com.harsh.inventory.model.Product;
import com.harsh.inventory.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping("/{id}/low")
    public String checkStock(@PathVariable Long id) {
        return service.isLowStock(id) ? "Low Stock" : "Stock OK";
    }
}