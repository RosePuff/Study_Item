package com.chin.mapper;

import com.chin.entity.User;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/26
 * @Version: 1.0
 **/
public interface UserMappers {

    List<User> selectUser();

    int insertUser(User user);

    int deleteUser(int id);
}
