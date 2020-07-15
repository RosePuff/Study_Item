import com.chin.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestDemo
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/14
 * @Version: 1.0
 **/
public class TestDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        user.show();
    }
}
