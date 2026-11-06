package com.example.bizx.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bizx.UserEntity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Integer> {

	LoginEntity findByUsername(String username);

}