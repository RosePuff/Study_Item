package com.ll.mapper;

import com.ll.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/04
 * @Version: 1.0
 **/
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> getUsers();

    // 方法存在多个参数的时候必须加上@Param()注解
    @Select("SELECT * FROM user WHERE id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("INSERT INTO user( id, name, pwd ) VALUES ( #{id}, #{name}, #{password})")
    int insertUser(User user);

    @Update("UPDATE user SET name = #{name}, pwd = #{password} WHERE id = #{id}")
    int updateUser(User user);

    @Delete("DELETE FROM user WHERE id = #{uid}")
    int deleteUser(@Param("uid") int id);
}
