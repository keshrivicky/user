package com.online.user.response;

import java.util.Optional;

import com.online.user.entity.Department;
import com.online.user.entity.User;

public class UserDepeartment {
	
	
	private Department department;
	private Optional<User> user;
	
	
	public UserDepeartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Optional<User> getUser() {
		return user;
	}
	public void setUser(Optional<User> list) {
		this.user = list;
	}
	@Override
	public String toString() {
		return "UserDepeartment [department=" + department + ", user=" + user + "]";
	}
	
	

}
