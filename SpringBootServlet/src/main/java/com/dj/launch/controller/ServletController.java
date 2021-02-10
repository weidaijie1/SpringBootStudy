package com.dj.launch.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
@RestController
public class ServletController {


    @GetMapping("/hello")
    public  String hello(HttpServletRequest request, HttpSession session){
        //操作request
        request.setAttribute("a","a");
        request.setAttribute("a","b");
        request.getAttribute("a");
        request.removeAttribute("a");

        //操作session
        session.setAttribute("a","a");
        session.getAttribute("a");
        session.invalidate();
        log.info("日志----------");
        System.out.println("rizhi 1111111111");
        return "hello";


    }
}
