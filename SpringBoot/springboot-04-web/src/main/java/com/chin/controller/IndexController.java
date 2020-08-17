package com.chin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @ClassName: IndexController
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/15
 * @Version: 1.0
 **/

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("msg", "<h1>hello world</h1>");

        model.addAttribute("lists", Arrays.asList("cat", "dog", "chin"));
        return "index";
    }


}
