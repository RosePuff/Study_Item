import com.chin.mapper.UserMappers;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Demo1
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/26
 * @Version: 1.0
 **/
public class Demo1 {
    @Test
    public void demo1or() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMappers userMappers = context.getBean("userMappers", UserMappers.class);
        userMappers.selectUser().forEach(user -> System.out.println(user));
    }
}
