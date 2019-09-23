package org.example.pagehelper.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.catalina.User;
import org.example.pagehelper.dao.BookMapper;
import org.example.pagehelper.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingzhihong
 * @date 2019/9/23 11:33
 */

@RestController
public class BookController {
    @Autowired
    private BookMapper bookMapper;
    //访问路径 http://localhost:8888/getBookList?pageNum=3&pageSize=2
    //分页获取表中的数据
    @RequestMapping("/getBookList")
    public Page<Book> getBookList(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        Page<Book> userList = bookMapper.getUserList();
        System.out.println(userList);
        return userList;
    }
}
