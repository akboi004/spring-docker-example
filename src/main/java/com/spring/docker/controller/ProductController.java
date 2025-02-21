package com.spring.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.docker.entity.Product;
import com.spring.docker.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping("/getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = service.getAllProducts();
        if (products.isEmpty()) {
            return ResponseEntity.noConstent().build();
        }
        return ResponseEntity.ok(products);
    }
}
