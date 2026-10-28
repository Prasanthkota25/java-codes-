package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.LoginEntity;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	// Register a new user
	public String registerUser(LoginEntity user) {
		// Check if username/email already exists
		if (loginRepository.findByUserName(user.getUserName()) != null) {
			return "Username already exists";
		}
		if (user.getEmail() != null && loginRepository.findByEmail(user.getEmail()) != null) {
			return "Email already registered";
		}

		// Check password confirmation
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			return "Passwords do not match";
		}

		// Save user
		loginRepository.save(user);
		return "Registration successful";
	}

	// Login user
	public String loginUser(String userName, String password) {
		LoginEntity user = loginRepository.findByUserName(userName);
		if (user == null) {
			return "User not found";
		}

		if (!user.getPassword().equals(password)) {
			return "Invalid password";
		}

		return "Login successful";
	}

}
