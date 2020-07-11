package com.ll.mapper;

import com.ll.entity.Blog;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: BlogMapper
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/07
 * @Version: 1.0
 **/
public interface BlogMapper {

    int insertBlog(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogForEach(Map map);
}
