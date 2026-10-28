package com.example.demo.Userentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class LeaveBalanceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int totalLeave;
	private int usedLeave;
	private int remainingLeave;

	@OneToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTotalLeave() {
		return totalLeave;
	}

	public void setTotalLeave(int totalLeave) {
		this.totalLeave = totalLeave;
	}

	public int getUsedLeave() {
		return usedLeave;
	}

	public void setUsedLeave(int usedLeave) {
		this.usedLeave = usedLeave;
	}

	public int getRemainingLeave() {
		return remainingLeave;
	}

	public void setRemainingLeave(int remainingLeave) {
		this.remainingLeave = remainingLeave;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

}
