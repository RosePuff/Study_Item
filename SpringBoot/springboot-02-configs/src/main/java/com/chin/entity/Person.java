package com.chin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: Person
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/14
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Validated
@ConfigurationProperties(prefix = "person")
public class Person {

    // @Email(message = "邮箱格式不正确")
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;
}
