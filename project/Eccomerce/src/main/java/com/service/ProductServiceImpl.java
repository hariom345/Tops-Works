package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo repo;

	@Override
	public void addOrUpdate(Product product) {
		repo.save(product);

	}

	@Override
	public void deleteProduct(int id) {

		repo.deleteById(id);

	}

	@Override
	public List<Product> viewAllProduct() {

		return repo.findAll();
	}

	@Override
	public Product getProductById(int id) {

		return repo.findById(id).orElseThrow();
	}

}
