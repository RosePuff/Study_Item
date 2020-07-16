import com.chin.entity.Student;
import com.chin.entity.User;
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
public class TestDISET {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /*
        Student{
            name='DI注入', address='Address{address='刘钦华'},
            books=[Tools, 统一阿萨姆, 计算机与实现],
            cloe=[歌曲, 代码, 电影],
            cad={
                身份证=4402024510100110,
                银行卡=110393857610298324983324
                },
            games=[FF14, LOL, csGo],
            info={
                password=123456,
                url=男,
                driver=1001023,
                username=root
                },
            wife='null'
            }
         */
    }

    @Test
    public void PDI() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user2", User.class);
        User user3 = context.getBean("user2", User.class);
        // System.out.println(user.toString());
        System.out.println(user == user3);
        System.out.println(user.hashCode());
        System.out.println(user3.hashCode());
    }

}
