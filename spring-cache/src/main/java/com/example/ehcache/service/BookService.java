package com.example.ehcache.service;

import com.example.ehcache.entity.Book;

/**
 * @author mingzhihong
 * @date 2019/11/11 14:36
 */
public interface BookService {

    void saveOrUpdate(Book book);


    Book get(Integer id);

    void delete(Integer id);
}
