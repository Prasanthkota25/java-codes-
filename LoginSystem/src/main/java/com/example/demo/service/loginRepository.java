package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.LoginEntity;

@Repository
public interface loginRepository extends JpaRepository<LoginEntity, Long> {

	LoginEntity findByUserName(String userName);

	LoginEntity findByEmail(String email);
}
