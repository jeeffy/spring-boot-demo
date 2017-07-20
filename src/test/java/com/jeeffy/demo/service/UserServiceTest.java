package com.jeeffy.demo.service;

import com.jeeffy.demo.Application;
import com.jeeffy.demo.BaseTest;
import com.jeeffy.demo.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class UserServiceTest extends BaseTest {

	private static Integer id = 1;

	@Autowired
	UserService userService;

	@Test
	public void testGetByMap() {
    	List<User> list = userService.getByMap(null);
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