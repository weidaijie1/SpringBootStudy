package com.dj.launch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//用配置文件的指定端口DEFINED_PORT作为启动端口运行测试用例

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    MailService mailService;

    @Test
    public void sendSimpleMail() {
        System.out.println("1111");
        System.out.println("2222");
        mailService.sendSimpleMail("951687336@qq.com",
                "普通文本邮件",
                "普通文本邮件内容测试");
    }
}
