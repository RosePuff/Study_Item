package com.chin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: RestFullController
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/03
 * @Version: 1.0
 **/
@Controller
public class RestFullController {

    @RequestMapping("/add")
    public String Test1(int a, int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为" + res);
        return "test";
    }

}
