package org.example.factorybean;

import org.example.collectiontype.Course;
import org.example.collectiontype.Movie;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {

    //定义返回的bean的类型
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("经典力学");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
//        return FactoryBean.super.isSingleton();
        return false;
    }
}
