package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/hello")
    public List<Book> hello() {
        return bookService.findAll();
    }
    //get路径传参
    @RequestMapping("/add/{name}")
    public List<Book> add(@PathVariable String name) {
        Book book = new Book();
        book.setName(name);
        bookService.add(book);
        return bookService.findAll();
    }
    //post json传参
    @RequestMapping("/add2")
    public List<Book> add2(@RequestBody Book book) {
        bookService.add2(book);
        return bookService.findAll();
    }
}
