package com.example.demo.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.userentity.userEntity;
import com.example.demo.userrepository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository repository;

	public userEntity register(userEntity user) {
		return repository.save(user);
	}

	public userEntity login(String username, String password) {
		return repository.findByUsernameAndPassword(username, password);
	}

	public boolean resetPassword(String username, String newPassword) {
		userEntity user = repository.findByUsername(username);
		if (user != null) {
			user.setPassword(newPassword);
			repository.save(user);
			return true;
		}
		return false;
	}

}
