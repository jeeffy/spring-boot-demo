package com.jeeffy.demo.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.jeeffy.BaseTest;
import com.jeeffy.demo.bean.User;


public class UserServiceTest extends BaseTest {

    private static Integer id = null;

    @Autowired
    UserService userService;

    @Test
    public void testList() {
        User user = new User();
        List<User> contracts = userService.list(user);
        Assert.assertNotNull(contracts);
    }

    @Test
    public void testGet() {
        User user = userService.get(id);
        Assert.assertNotNull(user);
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setId(null);
        user.setUsername(null);
        user.setPassword(null);
        user.setType(null);
        user.setPhone(null);
        user.setMail(null);
        user.setRoles(null);
        user.setAvatar(null);
        user.setName(null);
        user.setRemark(null);
        user.setCreateTime(null);
        user.setUpdateTime(null);
        userService.save(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(null);
        user.setUsername(null);
        user.setPassword(null);
        user.setType(null);
        user.setPhone(null);
        user.setMail(null);
        user.setRoles(null);
        user.setAvatar(null);
        user.setName(null);
        user.setRemark(null);
        user.setCreateTime(null);
        user.setUpdateTime(null);
        userService.update(user);
    }
    @Test
    public void testDelete() {
        userService.delete(id);
    }

}