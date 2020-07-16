import com.chin.entity.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestDemo
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/16
 * @Version: 1.0
 **/
public class AutowiredTest {
    @Test
    public void Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        People people = context.getBean("people", People.class);
        people.getDog().shout();
        people.getCat().shout();
    }
}
