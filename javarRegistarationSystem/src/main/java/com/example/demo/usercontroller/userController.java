package com.example.demo.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.userentity.userEntity;
import com.example.demo.userservice.userService;

@Controller
public class userController {

	@Autowired
	private userService service;

	@GetMapping("/registrationpage")
	public String register() {
		return "registrationpage";
	}

	@GetMapping("/loginpage")
	public String login() {
		return "loginpage";
	}

	@GetMapping("/forgotpage")
	public String forgot() {
		return "forgotpage";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute("userObj") userEntity user) {
		service.register(user);
		return "redirect:/loginpage";
	}

	@PostMapping("/login")
	public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {

		userEntity user = service.login(username, password);

		if (user != null) {
			model.addAttribute("username", user.getUsername());
			return "welcomepage";
		}

		model.addAttribute("error", "Invalid username or password");
		return "loginpage";
	}

	@PostMapping("/forgotpassword")
	public String forgotPassword(@RequestParam String username, @RequestParam String newPassword,
			@RequestParam String confirmPassword, Model model) {

		if (!newPassword.equals(confirmPassword)) {
			model.addAttribute("error", "Passwords do not match");
			return "forgotpage";
		}

		boolean isUpdated = service.resetPassword(username, newPassword);

		if (isUpdated) {
			model.addAttribute("message", "Password updated successfully. Please login with new password.");
			return "loginpage";
		} else {
			model.addAttribute("error", "Username not found. Please try again.");
			return "forgotpage";
		}
	}

}
