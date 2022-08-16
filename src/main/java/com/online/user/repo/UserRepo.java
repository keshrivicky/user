package com.online.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.user.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
