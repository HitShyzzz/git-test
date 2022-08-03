package com.example.controller;

import com.example.config.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/07/28/0:17
 * @Description:
 */
@RestController
public class HelloController {
    @Resource
    student student = new student();

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello,SpringBoot!!!!!!!";
    }


}
