import com.ll.entity.Hello;
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
        // 获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 现在对象都在Spring中管理，要使用的话直接取出来即可
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
