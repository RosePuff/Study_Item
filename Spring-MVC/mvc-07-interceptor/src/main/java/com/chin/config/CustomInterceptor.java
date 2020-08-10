package com.chin.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: CustomInterceptor
 * @Description: 自定义拦截器
 * @Author: LQH
 * @Date: 2020/08/10
 * @Version: 1.0
 **/
public class CustomInterceptor implements HandlerInterceptor {
    /**
     * @Title: preHandle
     * @Description: 拦截器
     * @param: request
     * @param: response
     * @param: handler
     * @return: boolean
     * @Author: LQH
     * @Date: 2020/08/10 23:44
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("======处理前======");
        return true;
    }

    /**
     * @Title: postHandle
     * @Description: 拦截器日志所在
     * @param: request
     * @param: response
     * @param: handler
     * @param: modelAndView
     * @return: void
     * @Author: LQH
     * @Date: 2020/08/10 22:21
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("======处理后======");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("======clean======");
    }
}
