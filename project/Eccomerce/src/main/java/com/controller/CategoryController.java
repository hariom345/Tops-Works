package com.controller;

import org.eclipse.tags.shaded.org.apache.bcel.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Category;
import com.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	CategoryService service;
	
	@GetMapping("/categories")
	public String catogeries(Model model) {
		model.addAttribute("category", new Category());
		model.addAttribute("categories", service.viewAllCategory());
		return "categories";
	}
	
	@PostMapping("/addCategory")
	public String addOrUpdateCategory(@ModelAttribute Category category) {
		service.addOrUpdate(category);
		return "redirect:/categories";
	}
	
	@GetMapping("/delete")
	public String deleteCategory(@RequestParam("cid") int cid) {
		service.deleteCategory(cid);
		return "redirect:/categories";
	}
	
	@GetMapping("/edit")
	public String editCategory(@RequestParam("cid") int cid,Model model) {
		model.addAttribute("category",service.getCategoryById(cid));
		model.addAttribute("categories", service.viewAllCategory());
		return "categories";
	}
	
	
	

}
