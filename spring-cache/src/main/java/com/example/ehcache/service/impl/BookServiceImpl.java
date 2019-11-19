package com.example.ehcache.service.impl;

import com.example.ehcache.dao.BookDao;
import com.example.ehcache.entity.Book;
import com.example.ehcache.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author mingzhihong
 * @date 2019/11/11 15:14
 */
@Service
public class BookServiceImpl implements  BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    @CachePut(value = "book", key = "#book.id")//设置缓存
    public void saveOrUpdate(Book book) {
        bookDao.insertOrUpdate(book);
    }

    @Override
    @Cacheable(value = "book", key = "#id")
    public Book get(Integer id) {
        System.out.println("走缓存");
        Book bookList = bookDao.getBookList(id);
        return bookList;
    }

    @Override
    @CacheEvict(value = "book")
    public void delete(Integer id) {
        bookDao.delete(id);
    }
}
