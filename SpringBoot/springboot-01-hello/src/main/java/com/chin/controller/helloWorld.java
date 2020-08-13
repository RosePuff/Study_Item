package com.chin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: helloWorld
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/13
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/hello")
public class helloWorld {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

}
