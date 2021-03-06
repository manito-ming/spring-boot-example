package com.example.ehcache.dao;

import com.example.ehcache.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author mingzhihong
 * @date 2019/11/11 15:02
 */
@Repository
public interface BookDao {
    void delete(Integer id);

    Book update(Book user);

    Book getBookList(@Param("id") Integer id);

    int insertOrUpdate(Book user);
}
