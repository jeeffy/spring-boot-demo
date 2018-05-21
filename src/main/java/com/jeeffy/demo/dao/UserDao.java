package com.jeeffy.demo.dao;

import com.jeeffy.demo.bean.User;

import java.util.List;

public interface UserDao {

	List<User> list(User user);
	User get(Integer id);
	Integer save(User user);
	int update(User user);
	int delete(Integer id);
}