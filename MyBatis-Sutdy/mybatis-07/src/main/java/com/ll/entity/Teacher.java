package com.ll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName: Teacher
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/07
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher {
    private int id;
    private String name;
}
