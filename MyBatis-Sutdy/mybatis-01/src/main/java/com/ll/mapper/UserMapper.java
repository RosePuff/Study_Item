package com.ll.mapper;

import com.ll.entity.User;

import java.util.List;
import java.util.Map;

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

    User getUserById2(Map<String, Object> map);

    // 添加一个用户数据
    int insertUserAll(Map<String, Object> map);

    // 插入数据
    int insertUser(User user);

    // 更新数据
    int updateUser(User user);

    // 删除数据
    int deleteUser(int id);

}