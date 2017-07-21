package com.jeeffy.demo.service;

import com.jeeffy.demo.BaseTest;
import com.jeeffy.demo.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserServiceTest extends BaseTest {

	private static Integer id = 1;

	@Autowired
	UserService userService;

	@Test
	public void testGetByMap() {
    	List<User> list = userService.get(null);
		assertNotNull(list);
	}

    @Test
	public void testCreate() {
    	User user = new User();
		userService.create(user);
	}

    @Test
    public void testGetById() {
    	User user = userService.getById(id);
		System.out.println(user);
		assertNotNull(user);
    }

    @Test
	public void testDelete() {
		userService.delete(id);
	}

}