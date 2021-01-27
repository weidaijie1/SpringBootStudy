package com.itheima;

import com.itheima.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringBootApplicationTest {
    @Autowired
    private Person person;
    @Test
    public  void test(){
        System.out.println(person);
        System.out.println("11111111115555555555555555555511111");
    }
}
