package com.ll.mapper;

import com.ll.entity.User;
import com.ll.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: com.ll.mapper.UserDaoTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/06/29
 * @Version: 1.0
 **/
public class UserDaoTest {

    private static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void log4j() {
        logger.info("info进入了Log4j");
        logger.debug("debug进入了Log4j");
        logger.error("error进入了Log4j");
    }

    @Test
    public void getUserLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> userLimit = mapper.getUserLimit(map);
        for (User user : userLimit) {
            System.out.println(user);

        }

        sqlSession.close();
    }

    @Test
    public void getUserRowBounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 通过RowBounds
        RowBounds rowBounds = new RowBounds(1, 2);

        List<User> selectList = sqlSession.selectList("com.ll.mapper.UserMapper.getUserRowBounds", rowBounds);
        for (User user : selectList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}