package com.example.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.BookDao;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 阿谭
 * <p>
 * 2022-09-25 09:27
 */
@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    void getByID(){
        System.out.println(bookService.getByID(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setTag_name("bilibili");
        book.setName("哔哩哔哩2");
        book.setUrl("https://www.bilibili.com/");
        book.setWeight("1");
        book.setNote("video web");
        bookService.save(book);
    }

    @Test
    void testDelete(){
        bookService.delete(10);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(8);
        book.setTag_name("BAIDU2");
        book.setName("百度2");
        book.setUrl("https://www.baidu.com/");
        book.setWeight("3");
        book.setNote("search web");
        bookService.update(book);
    }

    @Test
    void testGetALL(){
        bookService.getAll();
    }

    @Test
    void testPage(){
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getCurrent());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }

}
