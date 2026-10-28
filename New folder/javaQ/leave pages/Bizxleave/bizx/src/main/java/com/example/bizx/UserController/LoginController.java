package com.example.bizx.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bizx.UserEntity.LoginEntity;
import com.example.bizx.UserRepository.LoginRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class LoginController {

	@Autowired
	private LoginRepository repo;

	// GET ALL USERS
	//local host 2121
	@GetMapping
	public List<LoginEntity> getAllUsers() {
		return repo.findAll();
	}

	// GET USER BY USERNAME
	@GetMapping("/username/{username}")
	public ResponseEntity<LoginEntity> getUserByUsername(@PathVariable String username) {

		LoginEntity user = repo.findByUsername(username);

		if (user != null) {
			return ResponseEntity.ok(user);
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	// GET USER BY ID
	@GetMapping("/id/{id}")
	public ResponseEntity<LoginEntity> getUserById(@PathVariable Integer id) {

		return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	// REGISTER
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody LoginEntity user) {

		if (repo.findByUsername(user.getUsername()) != null) {

			return ResponseEntity.status(HttpStatus.CONFLICT).body("Username already exists");
		}

		repo.save(user);

		return ResponseEntity.status(HttpStatus.CREATED).body("Registration Successful");
	}

	// LOGIN
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody LoginEntity loginData) {

		LoginEntity user = repo.findByUsername(loginData.getUsername());

		if (user == null) {

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
		}

		if (user.getPassword().equals(loginData.getPassword())) {

			return ResponseEntity.ok("Login Successful");
		}

		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Password");
	}

	// RESET PASSWORD
	@PutMapping("/resetpassword")
	public ResponseEntity<String> resetPassword(@RequestBody LoginEntity data) {

		LoginEntity user = repo.findByUsername(data.getUsername());

		if (user == null) {

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
		}

		user.setPassword(data.getPassword());

		repo.save(user);

		return ResponseEntity.ok("Password Reset Successful");
	}
}