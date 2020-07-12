package com.ll.mapper;

import com.ll.entity.User;
import com.ll.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserDaoTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/06/29
 * @Version: 1.0
 **/
public class UserDaoTest {
    @Test
    public void test() {
        //第一步：获得SqlSession对象

        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            //方式一：getMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();

            // 方法二：
            // List<User> userList = sqlSession.selectList("com.ll.mapper.UserMapper.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //关闭SqlSession
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void getUserId2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("Helloid", 1);
        mapper.getUserById2(map);

        sqlSession.close();
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.insertUser(new User(4, "哈哈哈哈啊", "12345678"));
        if (res > 0) {
            System.out.println("插入成功");
        }
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insertUserAll() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 5);
        map.put("userName", 5);
        map.put("passWord", "233333");
        mapper.insertUserAll(map);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(4, "呵呵", "jejejeej"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(4);

        sqlSession.commit();
        sqlSession.close();
    }

}