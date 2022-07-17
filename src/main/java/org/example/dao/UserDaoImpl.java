package org.example.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("userdao add ......");
    }

    @Override
    public int minus(int a, int b) {
        System.out.println("方法执行了。。。");
        return a - b;
    }
}
