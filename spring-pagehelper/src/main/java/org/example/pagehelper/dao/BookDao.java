package org.example.pagehelper.dao;


import org.apache.ibatis.annotations.Mapper;
import org.example.pagehelper.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mingzhihong
 * @date 2019/9/23 20:10
 */
@Repository
public interface BookDao {

    List<Book> getBookList();
}
