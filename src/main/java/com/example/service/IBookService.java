package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;

/**
 * 阿谭
 * <p>
 * 2022-09-25 09:54
 */
public interface IBookService extends IService<Book> {
    IPage<Book> getPage(int currentPage, int PageSize);
    IPage<Book> getPage(int currentPage, int PageSize, Book book);
}
