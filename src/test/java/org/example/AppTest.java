package org.example;

import static org.junit.Assert.assertTrue;

import org.example.bean.Emp;
import org.example.collectiontype.Course;
import org.example.collectiontype.Movie;
import org.example.collectiontype.Student;
import org.example.factorybean.MyBean;
import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);

        user.add();
    }

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book.toString());
    }

    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order.toString());
    }

    @Test
    public void testForeignBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testInnerBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }

    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());
        Movie movie = context.getBean("movies", Movie.class);
        System.out.println(movie.toString());
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testLifeCycle(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println("4、获取到bean对象，可以调用");
        System.out.println(user.toString());
        context.close();
    }

    @Test
    public void testXmlAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }

    @Test
    public void testServiceComponent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
