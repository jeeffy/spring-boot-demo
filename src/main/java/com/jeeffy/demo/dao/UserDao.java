package com.jeeffy.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeeffy.demo.bean.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
}