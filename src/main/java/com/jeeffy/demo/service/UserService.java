package com.jeeffy.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeeffy.demo.dao.UserDao;
import com.jeeffy.demo.bean.User;

@Service
public class UserService {

    @Autowired
	private UserDao userDao;
	
	public List<User> list(User user) {
	    return userDao.list(user);
	}
	
	public User get(Integer id) {
		return userDao.get(id);
	}
	
	public User save(User user) {
		userDao.save(user);
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