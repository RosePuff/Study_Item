package com.chin.service;

import com.chin.entity.Books;
import com.chin.mapper.BookMapper;

import java.util.List;

/**
 * @ClassName: BooksServiceImpl
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/05
 * @Version: 1.0
 **/
public class BooksServiceImpl implements BooksService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int insertBook(Books books) {
        return bookMapper.insertBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books selectBookById(int id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public List<Books> selectAllBooks() {
        return bookMapper.selectAllBooks();
    }
}
