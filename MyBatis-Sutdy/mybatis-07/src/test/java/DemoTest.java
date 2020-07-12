import com.ll.entity.Student;
import com.ll.entity.Teacher;
import com.ll.mapper.StudentMapper;
import com.ll.mapper.TeacherMapper;
import com.ll.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: DemoTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/07
 * @Version: 1.0
 **/
public class DemoTest {

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void testStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        studentList.forEach(student -> System.out.println(student));
        sqlSession.close();
    }
    @Test
    public void testStudent2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        studentList.forEach(student -> System.out.println(student));
        sqlSession.close();
    }
}
