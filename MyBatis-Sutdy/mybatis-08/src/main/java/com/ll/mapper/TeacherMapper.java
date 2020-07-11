package com.ll.mapper;

import com.ll.entity.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: TeacherMapper
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/07
 * @Version: 1.0
 **/
public interface TeacherMapper {
    // List<Teacher> getTeacher();

    Teacher getTeacher(@Param("tid") int id);
}
