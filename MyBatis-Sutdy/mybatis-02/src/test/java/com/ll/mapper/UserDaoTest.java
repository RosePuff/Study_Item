package com.ll.mapper;

import com.ll.entity.User;
import com.ll.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: UserDaoTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/06/29
 * @Version: 1.0
 **/
public class UserDaoTest {
    @Test
    public void getUserLike() {
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
}