package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Users;
import com.example.demo.repos.UserRepo;

@Service
public class UserService {
	//Business Logic
	
	
	@Autowired
	UserRepo userRepo;

	public Users saveUserObj(Users userObj) {
		// TODO Auto-generated method stub
		
		return userRepo.save(userObj);
		
	}

	public Users checkPassword(String userName, String password) {
		
		Users user = userRepo.findByUserNameAndPassword(userName,password);
		//Users user = userRepo.checkPassword(userName,password);
		
		
		if(user!=null)
			return user;
		else
			return null;
		
		
	}
	
	
	
	
	
	
	

}
