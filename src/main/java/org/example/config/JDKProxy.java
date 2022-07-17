package org.example.config;

import org.example.User;
import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


//测试aop的代理
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.minus(5, 3);
        System.out.println("result = "+result);
    }
}


//创建代理对象
class UserDaoProxy implements InvocationHandler {

    //传入UserDaoImpl对象
    private Object object;
    public UserDaoProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行之前。。。"+"方法名："+method.getName()+"。。。参数："+ Arrays.toString(args));

        Object res = method.invoke(object, args);

        System.out.println("方法执行之后。。。"+"方法名："+method.getName()+"。。。参数："+ Arrays.toString(args));

        return res;
    }
}