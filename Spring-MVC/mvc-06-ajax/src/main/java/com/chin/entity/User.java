package com.chin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: User
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/08
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private String sex;
}
