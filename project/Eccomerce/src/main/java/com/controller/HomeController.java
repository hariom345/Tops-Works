package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String indexPage() {
		return "index";
	}

	@GetMapping("/cart")
	public String cart() {

		return "cart";
	}

	@GetMapping("/shop")
	public String shop() {

		return "shop";
	}

	@GetMapping("/checkout")
	public String checkout() {

		return "checkout";
	}

	@GetMapping("/product-details")
	public String productdetails() {

		return "product-details";
	}
	
	@GetMapping("/login")
	public String loginPage() {

		return "login";
	}
	
	@GetMapping("/registration")
	public String registration() {

		return "registration";
	}

}
