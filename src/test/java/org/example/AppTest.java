package org.example;

import static org.junit.Assert.assertTrue;

import org.example.bean.Emp;
import org.example.collectiontype.Course;
import org.example.collectiontype.Movie;
import org.example.collectiontype.Student;
import org.example.config.SpringConfig;
import org.example.factorybean.MyBean;
import org.example.service.UserService;
import org.example.testJDBC.service.BookService;
import org.example.testTransaction.service.accountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

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
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        org.example.testaopano.User user = context.getBean("user", org.example.testaopano.User.class);
        user.add();
    }

    @Test
    public void testAopXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanAop.xml");
        org.example.testAopXml.Book book = context.getBean("book", org.example.testAopXml.Book.class);
        book.buy();
    }

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        org.example.testJDBC.entity.Book book = new org.example.testJDBC.entity.Book(1002, "《追风筝的人》", "y");
//        bookService.addBook(book);
//        int count = bookService.queryCount();
//        System.out.println("查询到 "+count+" 条记录");

//        org.example.testJDBC.entity.Book bookInfo = bookService.queryBookById(1001);    //根据bookid查询单个book对象
//        System.out.println(bookInfo);
//
//        List<org.example.testJDBC.entity.Book> bookList = bookService.findAll();    //返回book对象列表
//        System.out.println(bookList);

        //批量插入对象
//        List<Object[]> objects = new ArrayList<>();
//        Object[] o1 = {1003, "《基督山伯爵》", "N"};
//        Object[] o2 = {1004, "《百年孤独》", "N"};
//        Object[] o3 = {1005, "《羊脂球》", "Y"};
//        objects.add(o1);
//        objects.add(o2);
//        objects.add(o3);
//        bookService.batchAddBook(objects);

//        //批量修改对象
//        List<Object[]> objects = new ArrayList<>();
//        Object[] o1 = {"《三国演义》", "N", 1003};
//        Object[] o2 = {"《水浒传》", "N", 1004};
//        Object[] o3 = {"《红楼梦》", "Y", 1005};
//        objects.add(o1);
//        objects.add(o2);
//        objects.add(o3);
//        bookService.batchUpdateBook(objects);

        //批量删除对象
        List<Object[]> objects = new ArrayList<>();
        Object[] o1 = {1003};
        Object[] o2 = {1004};
        Object[] o3 = {1005};
        objects.add(o1);
        objects.add(o2);
        objects.add(o3);
        bookService.batchDeleteBook(objects);
    }

    @Test
    public void testTransaction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        accountService accountService = context.getBean("accountService", org.example.testTransaction.service.accountService.class);
        accountService.trade();
    }

    @Test
    public void testTransactionAnno() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        accountService accountService = context.getBean("accountService", org.example.testTransaction.service.accountService.class);
        accountService.trade();
    }
}
