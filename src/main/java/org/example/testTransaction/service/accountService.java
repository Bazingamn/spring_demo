package org.example.testTransaction.service;

import org.example.testTransaction.dao.accountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
public class accountService {

    @Autowired
    private org.example.testTransaction.dao.accountDao accountDao;

    public void trade() {
        accountDao.addMoney();
//        int i = 10/0;
        accountDao.reduceMoney();
    }
}
