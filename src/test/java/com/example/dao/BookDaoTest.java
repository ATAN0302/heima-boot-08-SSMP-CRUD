package com.example.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 阿谭
 * <p>
 * 2022-09-24 17:24
 */
@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;
    @Test
    void testByID(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setTag_name("bilibili");
        book.setName("哔哩哔哩");
        book.setUrl("https://www.bilibili.com/");
        book.setWeight("1");
        book.setNote("video web");
        bookDao.insert(book);
    }

    @Test
    void testDelete(){
        bookDao.deleteById(9);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(8);
        book.setTag_name("BAIDU");
        book.setName("百度");
        book.setUrl("https://www.baidu.com/");
        book.setWeight("2");
        book.setNote("search web");
        bookDao.updateById(book);
    }

    @Test
    void testGetALL(){
        bookDao.selectList(null);
    }

    @Test
    void testPage(){
        IPage page = new Page(2,3);
        bookDao.selectPage(page,null);
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getCurrent());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBY(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("tag_name","二叉树");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBY2(){
        String name = "动态规划";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(name != null,Book::getTag_name,name);
        bookDao.selectList(lqw);
    }
}
