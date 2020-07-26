package com.chin.mapper;

import com.chin.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @ClassName: UserMapperImpl
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/26
 * @Version: 1.0
 **/
public class UserMappersImpl extends SqlSessionDaoSupport implements UserMappers {

    @Override
    public List<User> selectUser() {
        User user = new User(10, "校长", "12312435");

        UserMappers mapper = getSqlSession().getMapper(UserMappers.class);

        mapper.insertUser(user);
        mapper.deleteUser(8);

        return mapper.selectUser();
    }

    @Override
    public int insertUser(User user) {
        return getSqlSession().getMapper(UserMappers.class).insertUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMappers.class).deleteUser(id);
    }
}
