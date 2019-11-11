package com.example.ehcache.service;

import com.example.ehcache.entity.Book;

/**
 * @author mingzhihong
 * @date 2019/11/11 14:36
 */
public interface BookService {

    Book saveOrUpdate(Book user);


    Book get(Long id);

    void delete(Long id);
}
