import com.chin.service.ChinService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: AOPTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/25
 * @Version: 1.0
 **/
public class AOPTest {
    @Test
    public void AOP1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ChinService service = context.getBean("chinService", ChinService.class);
        service.add();
        service.delete();

    }
}
