package org.example.pagehelper.BookService;

import org.example.pagehelper.pojo.Book;

import java.util.List;

/**
 * @author mingzhihong
 * @date 2019/9/23 20:06
 */
public interface BookService {
    public List<Book> selectAll();
}
