package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pagecontroller {

	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}

	@GetMapping("/login")
	public String login() {
		return "Loginpage" + "";
	}

	@GetMapping("/forgot")
	public String forgot() {
		return "Forgotpassword";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

}
