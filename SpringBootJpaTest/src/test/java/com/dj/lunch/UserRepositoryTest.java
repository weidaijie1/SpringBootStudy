package com.dj.lunch;

import com.dj.lunch.dao.UserRepository;
import com.dj.lunch.model.UserDO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest{

    UserRepository userRepository;
    /**
     * 初始化一个对象 UserDO 测试Insert过程
     * */
    @Before
    public void before(){
        System.out.println("before--------------");
        UserDO userDO=new UserDO();
        userDO.setId(1);
        userDO.setUserName("fishpro");
        userDO.setSex(1);
        userDO.setLastLoginTime(new Date());
        userDO.setPassword("passWord");
        userRepository.save(userDO);
    }
    @Test
    public void testFind(){
        System.out.println("test-----------------");
        Optional<UserDO> optionalUserDO=userRepository.findById(1);
        if(optionalUserDO.isPresent()){
            UserDO userDO=optionalUserDO.get();
            System.out.println("testFind user"+userDO.getUserName());
        }

    }
}
