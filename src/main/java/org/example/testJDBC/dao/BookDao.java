package org.example.testJDBC.dao;

import org.example.testJDBC.entity.Book;

import java.util.List;

public interface BookDao {
    void addBook(Book book);

    int queryCount();

    Book queryBookById(Integer id);

    List<Book> findAll();

    void batchAddBook(List<Object[]> objects);

    void batchUpdateBook(List<Object[]> objects);

    void batchDeleteBook(List<Object[]> objects);
}
