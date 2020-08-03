package com.chin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: ControllerTest1
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/03
 * @Version: 1.0
 **/
@Controller
public class ControllerTest1 {

    @RequestMapping("/t1")
    public String test1(Model model) {
        model.addAttribute("msg", "ControllerTest");
        return "test1";
    }
}
