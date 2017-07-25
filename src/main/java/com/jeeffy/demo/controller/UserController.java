package com.jeeffy.demo.controller;

import java.util.List;
import java.util.Map;

import com.jeeffy.demo.bean.User2;
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
    public List<User> list(User user) {
		return userService.list(user);
    }

    @GetMapping("/deptId/{deptId}")
    public List<Map> findByDeptId(@PathVariable Integer deptId) {
        return userService.findByDeptId(deptId);
    }

    @GetMapping("/name/{username}")
    public User get(@PathVariable String username) {
        return userService.findByUsername(username);
    }

	@GetMapping("/{id}")
    public User get(@PathVariable Integer id) {
		return userService.get(id);
    }
    
    @PostMapping
    public User save(User user) {
		return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
		return userService.delete(id);
    }

    @DeleteMapping("deptId/{id}")
    public int deleteByDeptId(@PathVariable Integer id) {
        userService.deleteByDeptId(id);
        return 1;
    }

}