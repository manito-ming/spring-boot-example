package org.example.pagehelper.demo.dao;



import org.example.pagehelper.demo.model.Book;
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
