package org.example.pagehelper.dao;


import org.example.pagehelper.pojo.Book;

import java.util.List;

/**
 * @author mingzhihong
 * @date 2019/9/23 20:10
 */
public interface BookDao {

    List<Book> getBookList();
}
