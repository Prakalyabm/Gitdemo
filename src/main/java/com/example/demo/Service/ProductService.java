package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Product;

public interface ProductService  {

	public Product saveProduct(Product product);
	
	public Product updateProduct(int productId,Product updatedproduct);
	
	public Product deleteProduct(int productId);
	
	public Product findProduct(int productId);
	
	public List<Product> findAllProduct();

	
	
}

