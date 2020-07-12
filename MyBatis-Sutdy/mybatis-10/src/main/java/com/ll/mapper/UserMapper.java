package com.ll.mapper;

import com.ll.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: UserMapper
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/11
 * @Version: 1.0
 **/
public interface UserMapper {

    User queryUser(@Param("id") int id);

    int updateUser(User user);
}
