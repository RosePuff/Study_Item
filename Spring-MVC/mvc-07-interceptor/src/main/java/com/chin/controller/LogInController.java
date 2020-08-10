package com.chin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @ClassName: LogInController
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/10
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/user")
public class LogInController {

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session, Model model) {
        session.setAttribute("userLoginInfo", username);
        model.addAttribute("username", username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session) {
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
