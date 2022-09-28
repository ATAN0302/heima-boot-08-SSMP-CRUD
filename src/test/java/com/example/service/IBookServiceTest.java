//package com.example.service;
//
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.example.domain.Book;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
///**
// * 阿谭
// * <p>
// * 2022-09-25 09:27
// */
//@SpringBootTest
//public class IBookServiceTest {
//    @Autowired
//    private IBookService bookService;
//
//    @Test
//    void getByID(){
//        System.out.println(bookService.getById(1));
//    }
//
//    @Test
//    void testSave(){
//        Book book = new Book();
//        book.setTag_name("bilibili");
//        book.setName("哔哩哔哩3");
//        book.setUrl("https://www.bilibili.com/");
//        book.setWeight("1");
//        book.setNote("video web");
//        bookService.save(book);
//    }
//
//    @Test
//    void testDelete(){
//        bookService.removeById(11);
//    }
//
//    @Test
//    void testUpdate(){
//        Book book = new Book();
//        book.setId(8);
//        book.setTag_name("BAIDU3");
//        book.setName("百度3");
//        book.setUrl("https://www.baidu.com/");
//        book.setWeight("3");
//        book.setNote("search web");
//        bookService.updateById(book);
//    }
//
//    @Test
//    void testGetALL(){
//        bookService.list();
//    }
//
//    @Test
//    void testPage(){
//        IPage<Book> page = new Page<>(1,5);
//        bookService.page(page);
//        System.out.println(page.getPages());
//        System.out.println(page.getSize());
//        System.out.println(page.getCurrent());
//        System.out.println(page.getTotal());
//        System.out.println(page.getRecords());
//    }
//
//}
