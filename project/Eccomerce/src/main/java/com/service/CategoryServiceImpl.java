package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Category;
import com.repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepo repo;

	@Override
	public void addOrUpdate(Category category) {
	repo.save(category);

	}

	@Override
	public void deleteCategory(int id) {
		repo.deleteById(id);
		

	}

	@Override
	public List<Category> viewAllCategory() {
		
		return repo.findAll();
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

}
