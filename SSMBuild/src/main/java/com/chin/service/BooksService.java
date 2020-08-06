package com.chin.service;

import com.chin.entity.Books;

import java.util.List;

/**
 * @ClassName: BooksService
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/05
 * @Version: 1.0
 **/
public interface BooksService {
    int insertBook(Books books);

    int deleteBook(int id);

    int updateBook(Books books);

    Books selectBookById(int id);

    List<Books> selectAllBooks();

}
