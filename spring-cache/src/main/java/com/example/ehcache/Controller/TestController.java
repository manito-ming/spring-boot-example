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
}
