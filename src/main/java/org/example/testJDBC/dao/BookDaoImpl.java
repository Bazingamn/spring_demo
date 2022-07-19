package org.example.testJDBC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{

    //注入jdbcTemplate对象
    @Autowired
    private JdbcTemplate jdbcTemplate;
}
