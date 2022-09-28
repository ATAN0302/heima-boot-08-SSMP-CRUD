package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.controller.util.R;
import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * 阿谭
 * <p>
 * 2022-09-25 10:12
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true,bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
//        R r = new R();
//        boolean flag = bookService.save(book);
//        r.setFlag(flag);
        if(book.getName().equals("123"))throw new IOException();
        boolean flag = bookService.save(book);
        return new R(flag, flag ? "添加成功" : "添加失败!");
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }

    @GetMapping("{id}")
    public R getByID(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

//    @GetMapping("{currentPage}/{PageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int PageSize){
//        IPage page = bookService.getPage(currentPage,PageSize);
//        if(currentPage > page.getPages()){
//            page = bookService.getPage((int) page.getPages(),PageSize);
//        }
//        return new R(true,page);
//    }
        @GetMapping("{currentPage}/{PageSize}")
        public R getPage(@PathVariable int currentPage,@PathVariable int PageSize,Book book){



            IPage page = bookService.getPage(currentPage,PageSize,book);
            if(currentPage > page.getPages()){
                page = bookService.getPage((int) page.getPages(),PageSize,book);
            }
            return new R(true,page);
}

}