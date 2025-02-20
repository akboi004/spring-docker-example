package com.spring.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.docker.entity.Product;
import com.spring.docker.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;

	public List<Product> getAllProducts() {
		List<Product> productLst = productRepo.findAll();
		return productLst;
	}
}
