package com.pp.shopping.module.sys.model;

import java.io.Serializable;

/**
 * @Description:商品属性基本类
 * @Author: panpeng
 * @Date: 2018/5/30
 */
public class GoodsAttribute implements Serializable {

    private String code;

    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
