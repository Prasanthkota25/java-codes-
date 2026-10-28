
package com.example.demo.respo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Users;

@Repository
public interface UserRespo extends JpaRepository<Users, Long> {

	Optional<Users> findByUserName(String userName);

	Optional<Users> findByEmail(String email);
}
