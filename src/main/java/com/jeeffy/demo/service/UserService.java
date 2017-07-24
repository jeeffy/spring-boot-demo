package com.jeeffy.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeeffy.demo.dao.UserDao;
import com.jeeffy.demo.bean.User;

@Service
public class UserService {
    @Autowired
	private UserDao userDao;
	
	public List<User> get(User user) {
	    Example<User> example = Example.of(user);
        return userDao.findAll(example);
	}
	
	public User getById(Integer id) {
		return userDao.findOne(id);
	}

	@Transactional
	public User save(User user) {
		userDao.save(user);
		return user;
	}

	@Transactional
	public int delete(Integer id) {
		userDao.delete(id);
		return 1;
	}
    
}