package org.example.pagehelper.demo.service.impl;


import com.github.pagehelper.PageHelper;
import org.example.pagehelper.demo.dao.BookDao;
import org.example.pagehelper.demo.model.Book;
import org.example.pagehelper.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mingzhihong
 * @date 2019/9/23 20:08
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public List<Book> selectAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return bookDao.getBookList();
    }

}
