package com.online.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.user.entity.User;
import com.online.user.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	public List<User> getAll() {
		List<User> list = userRepo.findAll();
		return list;
	}

	public Optional<User> findById(Long id) {
		Optional<User> list = userRepo.findById(id);
		return list;
	}

	
	
}
