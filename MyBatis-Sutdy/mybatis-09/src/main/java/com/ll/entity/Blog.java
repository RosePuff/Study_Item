package com.ll.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: Blog
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/07
 * @Version: 1.0
 **/
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;

}
