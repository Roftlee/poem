package com.lys.service;

import com.lys.model.User;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: AsiQue
 * @date :2018.06.12 16:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class UserServiceTest {

    @Autowired
    private static UserService userService;

    @BeforeClass
    public static void init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        userService = (UserService)context.getBean(UserService.class);
    }

    @Test
    public void testGetUser() {
        try {
            User user = userService.selectByPrimaryKey(1L);

            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUpdateUser() {
        try {
            User user = User.builder().id(2L).build();

            Integer result = userService.updateByPrimaryKey(user);

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
