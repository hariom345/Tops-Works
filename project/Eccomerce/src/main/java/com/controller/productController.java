package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Category;
import com.model.Product;
import com.service.CategoryService;
import com.service.ProductService;

@Controller
public class productController {
	
	@Autowired
	ProductService service;
	
	@Autowired
	CategoryService catService;

	@GetMapping("/products")
	public String products(Model m) {
	    m.addAttribute("product", new Product());
	    m.addAttribute("products", service.viewAllProduct());
	    m.addAttribute("categories", catService.viewAllCategory());
	   
		return "products";
	}
	
	@PostMapping("/addProduct")
	public String addOrUpdate(@ModelAttribute Product product) {
		service.addOrUpdate(product);
		return "redirect:/products";
		
	}
	
	public String deleteProduct(int id) {
	 service.deleteProduct(id);
		return "redirect:/products";
	}
	
	public String getProductByID(@RequestParam("pid")int id,Model m) {
		m.addAttribute("product",service.getProductById(id));
		m.addAttribute("products", service.viewAllProduct());
		return "products";
	}
}
