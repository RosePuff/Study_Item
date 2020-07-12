package com.ll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: User
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/11
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
