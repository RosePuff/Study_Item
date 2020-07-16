import com.chin.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: AnnotationTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/17
 * @Version: 1.0
 **/
public class AnnotationTest {

    @Test
    public void getUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
