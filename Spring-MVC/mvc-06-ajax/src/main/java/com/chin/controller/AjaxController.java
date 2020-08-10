package com.chin.controller;

import com.chin.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AjaxController
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/07
 * @Version: 1.0
 **/
@RestController
public class AjaxController {

    @RequestMapping("/q1")
    public String test() {
        return "Hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>" + name);
        if ("liu".equals(name)) {
            response.getWriter().println("true");
        } else {
            response.getWriter().println("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("chin", 25, "男"));
        userList.add(new User("开发", 22, "男"));
        userList.add(new User("实际", 215, "男"));
        userList.add(new User("运维", 4, "女"));
        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name, String password) {
        String msg = "";
        if (name != null) {
            if ("admin".equals(name)) {
                msg = "OK";
            } else {
                msg = "用户名错误";
            }
        }
        if (password != null) {
            if ("123456".equals(password)) {
                msg = "OK";
            } else {
                msg = "密码Error";
            }
        }
        return msg;
    }
}
