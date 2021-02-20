package com.dj.launch.controller;

import com.dj.launch.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WireTest {

    @Autowired
    private MailService  mailService;

    @RequestMapping("test")
    @ResponseBody
    public  String  emailTest(){
        System.out.println("1111111");
        mailService.sendSimpleMail("951687336@qq.com",
                "普通文本邮件",
                "普通文本邮件内容测试");
        return "success";
    }

}
