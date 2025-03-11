package com.service;

import java.util.List;

import com.model.Category;

public interface CategoryService {
	public void addOrUpdate(Category category);
	public void deleteCategory(int id);
	public List<Category> viewAllCategory();
	public Category getCategoryById(int id);

}
