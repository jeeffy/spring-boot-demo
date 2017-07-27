package com.jeeffy.demo.service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeeffy.demo.dao.UserDao;
import com.jeeffy.demo.bean.User;

@Service
public class UserService {
    @Autowired
	private UserDao userDao;
	
	public List<User> list(User user) {
	    Map map = (Map)JSON.toJSON(user);
	    return userDao.list(map);
	}
	
	public User get(Integer id) {
		return userDao.get(id);
	}
	
	public User create(User user) {
		userDao.create(user);
		return user;
	}
	
	public User update(User user) {
		userDao.update(user);
		return user;
	}
	
	public void delete(Integer id) {
		userDao.delete(id);
	}
    
}