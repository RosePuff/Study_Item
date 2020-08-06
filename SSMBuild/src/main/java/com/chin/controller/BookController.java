package com.chin.controller;

import com.chin.entity.Books;
import com.chin.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName: BookController
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/05
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BooksService service;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> booksList = service.selectAllBooks();
        model.addAttribute("list", booksList);
        return "allBook";
    }

    @RequestMapping("/toInsertBook")
    public String toInsertBook() {
        return "insertBook";
    }

    @RequestMapping("/insertBook")
    public String insertBook(Books books) {
        System.out.println("insertBook=>" + books);
        service.insertBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books books = service.selectBookById(id);
        System.out.println(books);
        model.addAttribute("UBook", books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        System.out.println("update=>" + book);
        int i = service.updateBook(book);
        if (i > 0) {
            System.out.println("书籍添加成功" + book);
        }
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        service.deleteBook(id);
        return "redirect:/book/allBook";
    }
}
