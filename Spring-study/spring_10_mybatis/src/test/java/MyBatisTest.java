import com.chin.entity.User;
import com.chin.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: MyBatisTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/26
 * @Version: 1.0
 **/
public class MyBatisTest {

    @Test
    public void SpringMyBatisDemo1() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream stream = Resources.getResourceAsStream(resources);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = build.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void SpringMyBatisDemo2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        userMapper.selectUser().forEach(user -> System.out.println(user));
    }
}
