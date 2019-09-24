package org.example.pagehelper.BookService.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.pagehelper.BookService.BookService;
import org.example.pagehelper.dao.BookDao;
import org.example.pagehelper.pojo.Book;
import org.example.pagehelper.pojo.Page;
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
    public List<Book> selectAll() {
        return bookDao.getBookList();
    }

    public Page<Book> selectAllLimit(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Book> list = this.selectAll();
        PageInfo<Book> pageInfo = new PageInfo<Book>(list);
        Page<Book> page = new Page<Book>(pageInfo.getPageNum(),pageInfo.getPageSize(),pageInfo.getPages(),(int)pageInfo.getTotal(),list);
        return page;
    }
}
