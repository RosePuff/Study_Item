package com.chin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: IndexController
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/15
 * @Version: 1.0
 **/

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
