package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 阿谭
 * <p>
 * 2022-09-24 17:16
 */
@TableName("topic")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer id;
    private String tag_name;
    private String Name;
    private String url;
    private String weight;
    private String note;

}
