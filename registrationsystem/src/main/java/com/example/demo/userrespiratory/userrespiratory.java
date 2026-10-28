package com.example.demo.userrespiratory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.userentity.userentity;

public interface userrespiratory extends JpaRepository<userentity, Long> {

    userentity findByUsername(String username);
}
