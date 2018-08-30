package com.example.demo.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.UserInfo;
import com.example.demo.service.UserService;

@Controller
@EnableAutoConfiguration
public class TestController {
	//增加日志
    private final Logger log = LoggerFactory.getLogger(TestController.class);
    
    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody 
    UserInfo getUser() {
    	return userService.getUser("username123");
    }

    //增加新的对外访问接口
    @RequestMapping("/add")
    @ResponseBody 
    String add() {
    	userService.insertUser("username123","password123寇鑫");
        return "插入成功";
    }
    
    //增加新的对外访问接口
    @RequestMapping("/getAll")
    @ResponseBody 
    List<UserInfo> getAll() {
    	return userService.selectALL();
    }
    
    @RequestMapping("/")
    @ResponseBody
    String home() {
    	log.info("*********************输出日志Info——————");
    	log.error("*********************输出日志Error——————");
    	return "hello world2";
    }
}
