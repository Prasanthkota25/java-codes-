package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

	
	Users findByUserNameAndPassword(String userName, String password);

	@Query(value = """			
			select * from users where username= :userName 
			and password = :password """,nativeQuery = true)
	Users checkPassword(String userName, String password);

}
