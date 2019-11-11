package com.example.ehcache.dao;

import com.example.ehcache.entity.Book;

/**
 * @author mingzhihong
 * @date 2019/11/11 15:02
 */
public interface BookDao {
    void delete(String uuid);

    Book update(Book user);

    Book findByUuid(String uuid);

//    int save(@Param("user") Book user);
}
