import com.ll.entity.Blog;
import com.ll.mapper.BlogMapper;
import com.ll.utils.IdUtils;
import com.ll.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: DemoTest
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/08
 * @Version: 1.0
 **/
public class DemoTest {
    @Test
    public void insertBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.insertBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Java");
        mapper.insertBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Spring");
        mapper.insertBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("微服务");
        mapper.insertBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        map.put("title", "Mybatis");
        List<Blog> blogs = mapper.queryBlogIF(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogWHere() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title", "delete");
        map.put("views", 3333);

        List<Blog> blogs = mapper.queryBlogChoose(map);
        blogs.forEach(blog -> System.out.println(blog));
        sqlSession.close();
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title", "delete");
        map.put("author", "狂神");
        map.put("id", "1");

        mapper.updateBlog(map);

        sqlSession.close();
    }

    @Test
    public void queryBlogForEach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        map.put("ids", ids);

        List<Blog> blogs = mapper.queryBlogForEach(map);
        blogs.forEach(blog -> System.out.println(blog));

        sqlSession.close();
    }


}
