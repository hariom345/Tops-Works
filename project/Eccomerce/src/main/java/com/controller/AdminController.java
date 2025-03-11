package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping("/adminHome")
	public String adminHome() {
		return "adminHome";
	}
	
	@GetMapping("/users")
	public String usersPage() {
		
		return "users";
	}
	
	@GetMapping("/adminDashboard")
	public String dashboard() {
		
		return "adminDashboard";
	}
	
	
	

	
	@GetMapping("/orders")
	public String orders() {
		
		return "orders";
	}
	
	@GetMapping("/table")
	public String table() {
		
		return "table";
	}
	
	@GetMapping("/table2")
	public String table2() {
		
		return "table2";
	}


}
