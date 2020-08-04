package com.chin.controller;

import com.chin.pojo.User;
import com.chin.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: BookController
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/04
 * @Version: 1.0
 **/
@RestController
// @Controller
public class BookController {

    // @ResponseBody
    // json乱码原生态解决
    @RequestMapping(value = "/j1")
    public String json1() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User("刘钦华", "男", 25);
        return mapper.writeValueAsString(user);
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        // ObjectMapper格式化输出格式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        // long l = System.currentTimeMillis();
        // String str = date + " : " + l;

        // 定义格式化日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(simpleDateFormat);
        Date date = new Date();
        return mapper.writeValueAsString(date);
    }

    @RequestMapping("/j3")
    public String json3() {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }

    @RequestMapping("/j4")
    public String json4() {
        List<User> users = new ArrayList<>();
        User user = new User("alibaba", "man", 24);
        User user1 = new User("213213", "man", 24);
        User user2 = new User("3432", "man", 24);
        User user3 = new User("5645", "man", 24);
        User user4 = new User("sada", "man", 24);
        User user5 = new User("asd", "man", 24);
        User user6 = new User("jsonTest", "man", 24);
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        return JsonUtils.getJson(users);
    }
}
