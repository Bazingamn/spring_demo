package org.example.service;

import org.example.dao.UserDao;

public class UserService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("userservice add ......");
    }
}
