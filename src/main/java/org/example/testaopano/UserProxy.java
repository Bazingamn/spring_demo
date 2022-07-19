package org.example.testaopano;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect  // 生成代理对象
@Order(2)
public class UserProxy {

    //抽取相同切入点
    @Pointcut(value = "execution(* org.example.testaopano.User.add(..))" )
    public void pointdemo() {

    }

//    @Before(value = "execution(* org.example.testaopano.User.add(..))")
//    public void before(){
//        System.out.println("before ......");
//    }

    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("User before ......");
    }

    @After(value = "pointdemo()")
    public void after(){
        System.out.println("after ......");
    }

    @AfterReturning(value = "pointdemo()")
    public void afterReturning(){
        System.out.println("afterReturning ......");
    }

    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around 前......");
        joinPoint.proceed();
        System.out.println("around 后......");
    }
}
