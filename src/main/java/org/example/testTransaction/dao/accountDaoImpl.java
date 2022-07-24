package org.example.testTransaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class accountDaoImpl implements accountDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money-? where name=?";
        int update = jdbcTemplate.update(sql, 100, "Mary");
        if (update == 1)
            System.out.println("Mary的账户支出100元");
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money+? where name=?";
        int update = jdbcTemplate.update(sql, 100, "Lucy");
        if (update == 1)
            System.out.println("Lucy的账户收入100元");
    }
}
