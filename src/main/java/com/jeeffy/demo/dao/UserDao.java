package com.jeeffy.demo.dao;

import java.util.List;
import java.util.Map;

import com.jeeffy.demo.bean.User;

public interface UserDao {

	List<User> list(Map map);
	User get(Integer id);
	Integer create(User user);
	int update(User user);
	int delete(Integer id);
}