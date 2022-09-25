package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**

 阿谭

 2022-09-24 17:21
*/
@Mapper
public interface BookDao extends BaseMapper<Book>{

}
