package org.example.testTransaction.service;

import org.example.testTransaction.dao.accountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountService {

    @Autowired
    private org.example.testTransaction.dao.accountDao accountDao;

    public void trade() {
        accountDao.addMoney();
        accountDao.reduceMoney();
    }
}
