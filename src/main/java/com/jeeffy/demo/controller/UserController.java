package com.jeeffy.demo.controller;

import com.jeeffy.demo.bean.User;
import com.jeeffy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/users")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
    public List<User> list(User user) {
		return userService.list(user);
    }
	
	@GetMapping("/{id}")
    public User get(@PathVariable Integer id) {
		return userService.get(id);
    }
    
    @PostMapping
    public User create(User user) {
		return userService.create(user);
    }

    @PutMapping("/{id}")
    public User update(User user) {
		return userService.update(user);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
		userService.delete(id);
    }
    
}