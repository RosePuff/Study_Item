package com.chin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
- SpringBoot在启动的时候，从类路径下获取指定的值
- 将这些自动配置的类导入容器，自动配置就会生效，进行自动配置
- 整合的JavaEE，解决方案和自动配置的东西都在`spring-boot-autoconfigure:2.3.2.RELEASE`中
- 会把所有需要导入的组件，以类的方式返回，这些组件就会被添加到容器里面
- 容器中也会存在非常多的文件，就是这些文件给这类容器中导入了这个场景需要的所有组件
- 有了自动配置类 ， 免去了我们手动编写配置注入功能组件等的工作
 */
@SpringBootApplication
public class Springboot01HelloApplication {

    /**
     * @Title:
     * @Description: springBoot的启动类，实际上是启动了一个服务
     * @param: null
     * @return:
     * @Author: LQH
     * @Date: 2020/08/13 23:23
     */
    public static void main(String[] args) {

        SpringApplication.run(Springboot01HelloApplication.class, args);
    }

}
