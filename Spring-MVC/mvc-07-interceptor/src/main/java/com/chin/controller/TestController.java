package com.chin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/10
 * @Version: 1.0
 **/
@RestController
public class TestController {

    @RequestMapping("/a1")
    public String test() {
        System.out.println("==========执行完毕=======");
        return "OK";
    }
}
