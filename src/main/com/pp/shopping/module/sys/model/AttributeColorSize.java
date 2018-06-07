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
 * 商品颜色和尺寸的关系
 *
 * @author 系统自动生成
 * @version 1.0 2018-04-04
 */
public class AttributeColorSize extends  GoodsAttribute implements Serializable{

    private Integer id;

    private Integer attributeColorId;

    private Integer attributeSizeId;

    private Integer stock;

    private Date createTime;

    private Date updateTime;

    private Integer creator;

    private Integer updator;

    private Double price;

    private Double purchasePrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttributeColorId() {
        return attributeColorId;
    }

    public void setAttributeColorId(Integer attributeColorId) {
        this.attributeColorId = attributeColorId;
    }

    public Integer getAttributeSizeId() {
        return attributeSizeId;
    }

    public void setAttributeSizeId(Integer attributeSizeId) {
        this.attributeSizeId = attributeSizeId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}