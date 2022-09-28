package com.example.controller.util;

import lombok.Data;

/**
 * 阿谭
 * <p>
 * 2022-09-25 14:11
 */
@Data
public class R {
    private Boolean flag;
    private Object data;

    private String msg;

    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this.flag = false;
        this.msg = msg;
    }
}
