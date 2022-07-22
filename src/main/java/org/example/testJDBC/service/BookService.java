package org.example.testJDBC.service;

import org.example.testJDBC.dao.BookDao;
import org.example.testJDBC.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public int queryCount() {
        return bookDao.queryCount();
    }

    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    //查询返回集合
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    public void batchAddBook(List<Object[]> objects) {
        bookDao.batchAddBook(objects);
    }
}
