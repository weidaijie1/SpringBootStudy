package com.dj.lunch;


import com.dj.lunch.model.User;
import com.dj.lunch.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybitasTest {

    @Autowired
    private UserService userService;

    @Test
    public  void test(){
        User user = new User();
        user.setId(20);
        user.setUser_name("字母哥");
        user.setSex("nan");
        user.setAddress("朝阳大街");
        user.setBirthday(new Date());
        System.out.println(user);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int row = userService.inset_user(user);

        System.out.println("影响记录数："+row);
        System.out.println("雪花算法id: "+user.getId());
    }
}
