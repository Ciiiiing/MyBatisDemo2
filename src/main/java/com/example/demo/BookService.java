package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public List<Book> findAll() {
        return bookDao.findAll();
    }

    public int add(Book book) {
        return bookDao.add(book);
    }

    public int add2(Book book) {
        return bookDao.add2(book);
    }
}
