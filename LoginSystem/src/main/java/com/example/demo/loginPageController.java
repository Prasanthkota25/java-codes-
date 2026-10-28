package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoginService;

@Controller
public class loginPageController {

	@GetMapping("/login")
	public String MyLoginpage() {
		return "Loginpage";
	}

	@GetMapping("/registration")
	public String MyRegistrstion() {
		return "registration";
	}

	@GetMapping("/forgot")
	public String MyForgotpage() {
		return "Forgotpassword";
	}

	@GetMapping("/welcome")
	public String MyWelcome() {
		return "welcome";
	}
	
	
	

    @Autowired
    private LoginService loginService;

    // Handle registration form submission
    @PostMapping("/registration")
    public String registerUser(@ModelAttribute("user") LoginEntity user, Model model) {
        String result = loginService.registerUser(user);
        model.addAttribute("message", result);
        return "registration"; // return to registration page with message
    }

    // Handle login form submission
    @PostMapping("/login")
    public String loginUser(@RequestParam String userName, @RequestParam String password, Model model) {
        String result = loginService.loginUser(userName, password);

        if (result.equals("Login successful")) {
            return "welcome"; // redirect to welcome page
        } else {
            model.addAttribute("error", result);
            return "Loginpage"; // back to login page with error
        }
    }
}
