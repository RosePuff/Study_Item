package com.chin.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: LoginInterceptor
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/10
 * @Version: 1.0
 **/
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 判断登录情况
        HttpSession session = request.getSession();
        if (request.getRequestURI().contains("goLogin")) {
            return true;
        }
        if (request.getRequestURI().contains("login")) {
            return true;
        }
        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
