package com.cat.service.impl;

import com.cat.dao.BookDao;
import com.cat.dao.impl.BookDaoImpl;
import com.cat.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao=new BookDaoImpl();

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }
}
