package com.jeeffy.demo.controller;

import com.jeeffy.demo.domain.User;
import com.jeeffy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jiangfeng on 2017/7/18.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home() {
        return "Hello SpringBoot!";
    }

    @RequestMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/users/{deptId}/{page}")
    public Page<User> findByUserDeptId(@PathVariable Integer deptId, @PathVariable Integer page) {
        return userService.findByUserDeptId(deptId, page);
    }
}
