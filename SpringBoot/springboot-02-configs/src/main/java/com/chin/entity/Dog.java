package com.chin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Dog
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/14
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Dog {

    private String name;
    private Integer age;
}
