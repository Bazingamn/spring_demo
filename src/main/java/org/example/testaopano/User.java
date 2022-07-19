package org.example.testaopano;

import org.springframework.stereotype.Component;

@Component
public class User {

    //前置通知
    public void add(){
        System.out.println("add now ......");
    }
}
