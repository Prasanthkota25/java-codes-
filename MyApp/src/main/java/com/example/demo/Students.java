package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Students {

	@GetMapping("/openPage")
	public String kkkk() {
		return "cart";

	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("cartfjlsad");
	}

}
