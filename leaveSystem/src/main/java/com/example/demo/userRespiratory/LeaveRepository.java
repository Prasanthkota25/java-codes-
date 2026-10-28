package com.example.demo.userRespiratory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Userentity.LeaveEntity;

public interface LeaveRepository extends JpaRepository<LeaveEntity, Long> {

	List<LeaveEntity> findByUser_Id(Long userId);

	List<LeaveEntity> findByUser_Manager_Id(Long managerId);
}