package org.example.pagehelper.demo.service;


import org.example.pagehelper.demo.model.Book;

import java.util.List;

/**
 * @author mingzhihong
 * @date 2019/9/23 20:06
 */
public interface BookService {
    public List<Book> selectAll(Integer pageNum, Integer pageSize);
}
