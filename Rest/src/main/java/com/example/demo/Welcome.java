package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class Welcome {

	@GetMapping("/Mypage")
	public String welcome() {
		return "hello hi ";
	}

	@PutMapping("path/{id}")
	public String putMethodName(@PathVariable String id, @RequestBody String entity) {
		
		
		return entity;
	}
	
	@PostMapping("path")
	public String postMethodName(@RequestBody String entity) {
	
		
		return entity;
	}
	
}
