package com.jeeffy.demo;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jiangfeng on 2017/7/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BaseTest {

    public void assertNotNull(Object object){
        Assert.assertNotNull(object);
    }
}
