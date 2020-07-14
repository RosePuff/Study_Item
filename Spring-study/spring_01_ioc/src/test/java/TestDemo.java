import com.chin.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: NewTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/13
 * @Version: 1.0
 **/
public class TestDemo {

    public static void main(String[] args) {

        // //实际是使用的是业务层调用，Dao层不会使用
        // UserService userService = new UserServiceImpl();
        //
        // // ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        // ((UserServiceImpl) userService).setUserDao(new UserDaoDeleteImpl());
        //
        // userService.getUser();

        // 获取ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 这时候需要什么就直接get好了
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        // 直接获取
        userServiceImpl.getUser();
    }


}
