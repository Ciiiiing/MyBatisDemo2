package com.example.demo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao {
    @Select("select * from book")
    List<Book> findAll();
    @Insert("insert into book(name) values (#{name})")
    int add(Book book);
    @Insert("insert into book values (#{id},#{name})")
    int add2(Book book);
}
