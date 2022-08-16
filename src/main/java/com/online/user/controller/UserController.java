package com.online.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.online.user.entity.Department;
import com.online.user.entity.User;
import com.online.user.response.UserDepeartment;
import com.online.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/")
	public List<User> getAll(){
		List<User> list =   userService.getAll();
		System.out.println(list);
		return list;
	}
	
	@GetMapping("/{id}")
	public UserDepeartment getAll(@PathVariable("id") Long id){
		Optional<User> list =   userService.findById(id);
		UserDepeartment userDepeartment = new UserDepeartment();
		userDepeartment.setUser(list);
		try {		
		ResponseEntity<Department> department= restTemplate.getForEntity("http://localhost:8083/department/"+list.get().getDepartmentId(), Department.class);
		userDepeartment.setDepartment(department.getBody());
		}catch(Exception e){
			userDepeartment.setDepartment(null);
			return userDepeartment;
		}
		
			return userDepeartment;
		
		//return userDepeartment;
	}
	
}
