package org.jpa.service;

import org.jpa.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

}
