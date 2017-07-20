package com.jeeffy.demo;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jiangfeng on 2017/7/20.
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
//@TestPropertySource(locations = "classpath:/application.yml")
//@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

    public void assertNotNull(Object obj){
        System.out.println(obj);
        Assert.assertNotNull(obj);
    }
}