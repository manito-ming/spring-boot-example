package org.example.pagehelper.demo.controller;


import org.example.pagehelper.demo.model.Book;
import org.example.pagehelper.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private BookService bookService;
	//请求路径 http://localhost:8080/getBooks?pageNum=3&pageSize=2

	@RequestMapping("/getBooks")
	public List<Book> getBooks(Integer pageNum,Integer pageSize) {
		return bookService.selectAll(pageNum,pageSize);
	}



	
}
