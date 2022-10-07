package com.example.product;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import entity.Department;

public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/sortProducts")
	public ProductEntity sortproducts(@RequestBody ProductEntity product)
	{
		service.saveProduct(product);
		List<ProductEntity> sortedproducts = Collections.sort( product.getProductId(), Collections.reverseOrder());
	  return sortedproducts;
	  
		
	}
	
}
