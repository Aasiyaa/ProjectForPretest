package com.example.product;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
	@Autowired
	 private ProductRepo repo;
public ProductEntity saveProduct(ProductEntity product) {
		
		return repo.save(product);
	}

}
