package com.jeeffy.demo.dao;

import com.jeeffy.demo.bean.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

	List<User> list(Map map);
	User get(Integer id);
	Integer create(User user);
	int update(User user);
	int delete(Integer id);
}