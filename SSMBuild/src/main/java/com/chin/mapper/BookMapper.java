package com.chin.mapper;

import com.chin.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: BookMapper
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/05
 * @Version: 1.0
 **/
public interface BookMapper {
    int insertBook(Books books);

    int deleteBook(@Param("bookId") int id);

    int updateBook(Books books);

    Books selectBookById(@Param("bookId") Integer id);

    List<Books> selectAllBooks();

}
