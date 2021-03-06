package com.ll.mapper;

import com.ll.entity.User;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/06/29
 * @Version: 1.0
 **/
public interface UserMapper {

    // 查询用户
    List<User> getUserList();

    // 根据用户id查询用户
    User getUserById(int id);

}