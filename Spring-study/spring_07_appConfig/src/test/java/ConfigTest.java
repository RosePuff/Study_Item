import com.chin.config.ChinConfig;
import com.chin.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: ConfigTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/18
 * @Version: 1.0
 **/
public class ConfigTest {

    @Test
    public void Test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ChinConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}