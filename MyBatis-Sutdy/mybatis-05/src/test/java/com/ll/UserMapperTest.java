package com.ll;

import com.ll.entity.User;
import com.ll.mapper.UserMapper;
import com.ll.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: UserMapperTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/04
 * @Version: 1.0
 **/
public class UserMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();

        // for (User user : users) {
        //     System.out.println(user);
        // }
        // users.forEach(user -> System.out.println(user));
        users.forEach(System.out::println);

        // User userById = mapper.getUserById(1);
        // System.out.println("userById = " + userById);
        sqlSession.close();
    }

    @Test
    public void insert() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.insertUser(new User(9, "刘钦华", "12341231123"));

        sqlSession.close();
    }

    @Test
    public void update(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(5,"to","43534346643"));
        sqlSession.close();
    }

    @Test
    public void delete (){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);
        sqlSession.close();
    }
}
