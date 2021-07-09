package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author hefeng
 * @Description //TODO
 * @Date 2021/7/7 9:05
 */
@RestController
public class Hello {

    @GetMapping("/hello")
    public String sayHi(){
        return "hello world - jenkins \n" + new Date();
    }
}
