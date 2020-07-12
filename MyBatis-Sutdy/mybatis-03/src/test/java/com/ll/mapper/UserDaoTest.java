package com.ll.mapper;

import com.ll.entity.User;
import com.ll.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @ClassName: com.ll.mapper.UserDaoTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/06/29
 * @Version: 1.0
 **/
public class UserDaoTest {
    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        //关闭SqlSession
        sqlSession.close();
    }
}