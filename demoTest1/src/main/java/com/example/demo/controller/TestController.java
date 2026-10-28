package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	
	
	@GetMapping("/login")
	public String test() {
		
		return "loginpage";
	}
	
	@GetMapping("/test/{name}")
	public String test2(@PathVariable String name) {
		
		return "Hello, "+name;
	}
	
	@GetMapping("/viewProducts/{productId}")
	public String test2(@PathVariable Long productId) {
		
		return "Hello, "+productId;
	}
	
	
	

}
