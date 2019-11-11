package com.example.ehcache.service.impl;

import com.example.ehcache.entity.Book;
import com.example.ehcache.service.BookService;
import org.springframework.cache.annotation.CachePut;

/**
 * @author mingzhihong
 * @date 2019/11/11 15:14
 */
public class BookServiceImpl implements  BookService {
    @Override
    @CachePut(value = "people", key = "#person.id")
    public Book saveOrUpdate(Book user) {
        return null;
    }

    @Override
    public Book get(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
