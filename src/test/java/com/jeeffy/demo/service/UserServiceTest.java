package com.jeeffy.demo.service;

import com.jeeffy.demo.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;

/**
 * Created by jiangfeng on 2017/7/19.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        Assert.assertTrue(userService.findAll().size()>0);
    }

    @Test
    public void testFindByUserDeptId(){
        Page<User> users =  userService.findByUserDeptId(10, 1);
        for(User user : users){
            System.out.println("-----------"+user);
        }
        Assert.assertTrue(users.getTotalPages()>0);
    }
}
