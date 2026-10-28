package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@GetMapping("/login")
	public String test() {
		return "Loginpage";
	}
	
	@GetMapping("/forgot-password")
	public String forgotPage() {
		return "forgotPassword";
	}
	
	
	@PostMapping("/login")
	public String loginPostPage(@RequestParam(name = "userName") String userName,
			@RequestParam(name="password") String password) {
		
		System.out.println("username is :: "+userName +" Password:: "+password);
		
		if(userName.equals("admin"))
			return "succses";
		else
			return "Loginpage";
	}

}
