package com.jeeffy.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeeffy.demo.bean.User;
import com.jeeffy.demo.service.UserService;

@RequestMapping(value = "/users")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(method = RequestMethod.GET)
    public List<User> list(HttpServletRequest request) {
		return userService.getByMap(null);
    }
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User detail(@PathVariable Integer userId) {
		return userService.getById(userId);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public User create(@RequestBody User user) {
		return userService.create(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User update(@RequestBody User user) {
		return userService.update(user);
    }
    
    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public int delete(@PathVariable Integer userId) {
		return userService.delete(userId);
    }
    
}