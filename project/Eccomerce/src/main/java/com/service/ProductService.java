package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {

	public void addOrUpdate(Product product);
	public void deleteProduct(int id);
	public List<Product> viewAllProduct();
	public Product getProductById(int id);
}
