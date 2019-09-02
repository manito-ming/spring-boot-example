package org.jpa.controller;

import org.jpa.pojo.Book;
import org.jpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class SelctController {
    @Autowired
    BookService bookService;

    /**
     * 获取 Book 列表
     * 处理 "/book" 的 GET 请求，用来获取 Book 列表
     */
    @RequestMapping(method = RequestMethod.GET)
    public String getBookList(ModelMap map) {
        List<Book> books = bookService.findAll();
        return books.toString();
    }
}
