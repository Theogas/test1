package com.cat;

import com.cat.dao.BookDao;
import com.cat.service.BookService;
import com.cat.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
       ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service1 = (BookService) context.getBean("service1");
        service1.save();
    }
}
