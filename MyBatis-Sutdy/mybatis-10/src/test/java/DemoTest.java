import com.ll.entity.User;
import com.ll.mapper.UserMapper;
import com.ll.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @ClassName: DemoTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/11
 * @Version: 1.0
 **/
public class DemoTest {

    @Test
    public void queryUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUser(1);
        System.out.println(user);

        // mapper.updateUser(new User(2, "ddddddd", "ssssss"));
        // 手动清理缓存
        sqlSession.clearCache();

        System.out.println("=====================================");
        User user2 = mapper.queryUser(1);
        System.out.println(user2);

        System.out.println(user == user2);

        sqlSession.close();
    }

    @Test
    public void queryUser2() {
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user1 = mapper1.queryUser(1);
        System.out.println(user1);
        sqlSession1.close();

        User user2 = mapper2.queryUser(1);
        System.out.println(user2);

        System.out.println(user1 == user2);

        sqlSession2.close();
    }
}
