import com.ll.entity.Teacher;
import com.ll.mapper.TeacherMapper;
import com.ll.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @ClassName: DemoTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/07
 * @Version: 1.0
 **/
public class DemoTest {
    // @Test
    // public void test() {
    //     SqlSession sqlSession = MybatisUtils.getSqlSession();
    //     sqlSession.getMapper(TeacherMapper.class).getTeacher().forEach(teacher -> System.out.println(teacher));
    //     sqlSession.close();
    // }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }
}
