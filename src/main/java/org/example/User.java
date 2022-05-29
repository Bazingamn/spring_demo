package org.example;

public class User {

    private String name;

    public User() {
        System.out.println("1、创建bean实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2、设置属性值");
    }

    public void initMethod(){
        System.out.println("3、执行初始化方法");
    }

    public void destoryMethod(){
        System.out.println("5、执行销毁方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void add(){
        System.out.println("add............");
    }
}
