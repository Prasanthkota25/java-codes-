package com.example.demo.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.userentity.userEntity;

@Repository
public interface userRepository extends JpaRepository<userEntity, Long> {

	userEntity findByUsername(String username);

	userEntity findByUsernameAndPassword(String username, String password);
}
