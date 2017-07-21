package com.jeeffy.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jeeffy.demo.bean.User;
import com.jeeffy.demo.service.UserService;

@RequestMapping(value = "/users")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
    public List<User> list(HttpServletRequest request) {
		return userService.getByMap(null);
    }
	
	//@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @GetMapping("/{userId}")
    public User detail(@PathVariable Integer userId) {
		return userService.getById(userId);
    }
    
    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public User create(User user) {
		return userService.create(user);
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping("/{userId}")
    public User update(User user) {
		return userService.update(user);
    }
    
    //@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    @DeleteMapping("/{userId}")
    public int delete(@PathVariable Integer userId) {
		return userService.delete(userId);
    }
    
}