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
	
	
	@PostMapping
    public List<User> findAll(User user) {
		return userService.findAll(user);
    }
	
	@GetMapping("/{id}")
    public User detail(@PathVariable Integer id) {
		return userService.getById(id);
    }
    
    //@PostMapping
    public User create(User user) {
		return userService.create(user);
    }

    @PutMapping("/{id}")
    public User update(User user) {
		return userService.update(user);
    }
    
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
		return userService.delete(id);
    }
    
}