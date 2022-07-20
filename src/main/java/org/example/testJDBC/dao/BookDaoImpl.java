package org.example.testJDBC.dao;

import org.example.testJDBC.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{

    //注入jdbcTemplate对象
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getId(), book.getName(), book.getStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("成功插入 "+ update +" 行");
    }

    @Override
    public int queryCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book queryBookById(Integer id) {
        String sql = "select * from t_book where book_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }
}
