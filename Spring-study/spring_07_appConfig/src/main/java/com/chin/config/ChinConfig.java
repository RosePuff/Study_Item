package com.chin.config;

import com.chin.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName: ChinConfig
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/18
 * @Version: 1.0
 **/
@Configuration
@ComponentScan("com.chin.entity")
@Import(ChinConfig2.class)
public class ChinConfig {

    @Bean
    public User getUser() {
        return new User();
    }
}
