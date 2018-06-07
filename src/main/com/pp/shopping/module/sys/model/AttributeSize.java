/*
 * Attribute.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品尺寸属性
 *
 * @author 系统自动生成
 * @version 1.0 2018-04-04
 */
public class AttributeSize extends  GoodsAttribute implements Serializable{

    private int id;
    /**
     * 颜色
     */
    private String sizeCode;

    private Integer goodsId;

    private Date createTime;

    private Date updateTime;

    private Integer creator;

    private Integer updator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getUpdator() {
        return updator;
    }

    public void setUpdator(Integer updator) {
        this.updator = updator;
    }
}