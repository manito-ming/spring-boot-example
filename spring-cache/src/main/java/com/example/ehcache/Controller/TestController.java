package com.example.ehcache.Controller;

import com.example.ehcache.entity.Book;
import com.example.ehcache.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mingzhihong
 * @date 2019/11/13 17:23
 */
@RestController
public class TestController {
    //请求路径 http://localhost:8080/getBooks?id=2

    @Autowired
    private BookService bookService;
    @RequestMapping("/getBooks")
    public Book getBooks(Integer id) {
        return bookService.get(id);
    }
//    http://localhost:8080/deleteBook?id=2
    @RequestMapping("/deleteBook")
    public void deleteBooks(Integer id) {
         bookService.delete(id);
    }

    //    http://localhost:8080/saveOrUpdateBook?id=2
    @RequestMapping("/saveOrUpdateBook")
    public void saveOrUpdate(Integer id) {
        Book book = bookService.get(id);
        book.setName("操作系统");
        bookService.saveOrUpdate(book);
    }
}
