package com.chin.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: OneController
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/29
 * @Version: 1.0
 **/
public class OneController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView view = new ModelAndView();

        //封装对象，放在ModelAndView中。Model
        view.addObject("msg", "HelloSpringMVC!");
        //封装要跳转的视图，放在ModelAndView中
        view.setViewName("hello"); //: /WEB-INF/jsp/hello.jsp
        return view;

    }
}
