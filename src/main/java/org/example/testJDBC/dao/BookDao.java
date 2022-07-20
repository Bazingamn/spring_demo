package org.example.testJDBC.dao;

import org.example.testJDBC.entity.Book;

public interface BookDao {
    void addBook(Book book);

    int queryCount();

    Book queryBookById(Integer id);
}
