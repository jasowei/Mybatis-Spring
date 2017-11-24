package com.lanou.test;

import com.lanou.domain.User;
import com.lanou.mapper.UserMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by dllo on 17/11/7.
 */
public class MapperTest {


    private ApplicationContext context;

    @Before
    public void init() throws IOException {
        /*启动容器*/
        context = new ClassPathXmlApplicationContext("spring-config.xml");

    }

    @After
    public void close() {

    }

    @Test
    public void testDao() {
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
//        System.out.println(userMapper);
        User user = userMapper.selectByPrimaryKey(11);
        System.out.println(user);

    }

}
