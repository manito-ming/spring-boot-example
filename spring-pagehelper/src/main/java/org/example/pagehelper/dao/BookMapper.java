package org.example.pagehelper.dao;

import com.github.pagehelper.Page;
import org.example.pagehelper.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
/**
 * @author mingzhihong
 * @date 2019/9/23 11:31
 */
@Mapper
public interface BookMapper {

        @Select("SELECT * FROM book")
        Page<Book> getUserList();

}
