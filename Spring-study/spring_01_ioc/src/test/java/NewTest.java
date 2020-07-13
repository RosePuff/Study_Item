import com.chin.service.UserServiceImpl;

/**
 * @ClassName: NewTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/13
 * @Version: 1.0
 **/
public class NewTest {

    public static void main(String[] args) {

        //实际是使用的是业务层调用，Dao层不会使用
        UserServiceImpl userService = new UserServiceImpl();
        userService.getUser();
    }
}
