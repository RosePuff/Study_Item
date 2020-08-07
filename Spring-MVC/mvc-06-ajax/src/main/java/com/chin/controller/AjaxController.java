package com.chin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
}
