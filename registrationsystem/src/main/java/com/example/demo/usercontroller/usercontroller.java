package com.example.demo.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.userentity.userentity;
import com.example.demo.userservice.userservice;

@Controller
public class usercontroller {

	@Autowired
	private userservice service;

	@GetMapping("/registrationpage")
	public String registrationpage() {
		return "registrationpage";
	}

	@GetMapping("/loginpage")
	public String loginpage() {
		return "loginpage";
	}

	@GetMapping("/forgotpage")
	public String forgotpage() {
		return "forgotpage";
	}

	@GetMapping("/welcomepage")
	public String welcomepage() {
		return "welcomepage";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute("userObj") userentity user) {

		service.register(user);
		return "loginpage";
	}

	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, Model model) {

		userentity user = service.login(username, password);

		if (user != null) {
			model.addAttribute("username", user.getUsername());
			return "welcomepage";
		}

		model.addAttribute("error", "Invalid username or password");
		return "loginpage";
	}

	@PostMapping("/resetpassword")
	public String resetPassword(@RequestParam String username, @RequestParam String newPassword, Model model) {

		boolean result = service.resetPassword(username, newPassword);

		if (result) {
			model.addAttribute("msg", "Password updated successfully");
			return "loginpage";
		}

		model.addAttribute("msg", "User not found");
		return "forgotpage";
	}
}
