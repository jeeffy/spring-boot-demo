package com.jeeffy.demo.dao;

import com.jeeffy.demo.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jiangfeng on 2017/7/20.
 */
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetById(){
        User user = userDao.getById(1);
        System.out.println(user);
    }
}
