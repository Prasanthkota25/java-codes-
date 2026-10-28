package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	@GetMapping("/login")
	public String myLogin() {
		return "Loginpage";
	}

	@GetMapping("/registration")
	public String myRegistration() {
		return "registration";
	}

	@GetMapping("/forgot")
	public String myForgot() {
		return "Forgotpassword";
	}

	@GetMapping("/welcome")
	public String myPage() {
		return "welcome";
	}

}
