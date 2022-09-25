package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;

import java.util.List;

/**
 * 阿谭
 * <p>
 * 2022-09-25 09:21
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);

    Boolean delete(Integer id);

    Book getByID(Integer id);
    List<Book> getAll();

    IPage<Book> getPage(int currentPage,int pageSize);
}
