package com.example.demo.controller;


import com.example.demo.pojo.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author mingzhihong
 * @date 2019/9/4 18:46
 */
@Controller
@RequestMapping(value = "/book")
public class SelctController {
    @Autowired
    BookService bookService;

    /**
     * 获取 Book 列表
     * 处理 "/book" 的 GET 请求，用来获取 Book 列表
     */
    @RequestMapping(value = "select", method = RequestMethod.GET)    public String getBookList(ModelMap map) {
        List<Book> books = bookService.findAll();
        System.out.println(books.toString());
        return books.toString();
    }
}
