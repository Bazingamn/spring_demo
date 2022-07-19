package org.example.testaopano;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class PersonProxy {

    @Before(value = "execution(* org.example.testaopano.User.add(..))")
    public void before(){
        System.out.println("Person before ......");
    }
}
