package com.wuxiaoyan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 你好
 * @author: Jh Lee
 * @create: 2019-10-21 22:13
 **/
@RestController
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/add")
    @ResponseBody
    public String hello(){
        return "你好";
    }
}
