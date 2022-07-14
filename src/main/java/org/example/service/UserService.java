package org.example.service;

import org.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value(value = "张三")
    private String name;

    @Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void add(){
        System.out.println("userservice add ......"+name);
        userDao.add();
    }
}
