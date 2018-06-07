/*
 * ReceiveAddress.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 收获地址
 *
 * @author 系统自动生成
 * @version 1.0 2018-04-04
 */
public class ReceiveAddress implements Serializable{

    private long id;
    private int province;
    private int city;
    private int country;
    private String addressDetail;
    private int userId;
    private Date createTime;
    private int creator;
    private Date updateTime;
    private String updator;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getProvince() {
        return province;
    }
    public void setProvince(int province) {
        this.province = province;
    }
    public int getCity() {
        return city;
    }
    public void setCity(int city) {
        this.city = city;
    }
    public int getCountry() {
        return country;
    }
    public void setCountry(int country) {
        this.country = country;
    }
    public String getAddressDetail() {
        return addressDetail;
    }
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public int getCreator() {
        return creator;
    }
    public void setCreator(int creator) {
        this.creator = creator;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public String getUpdator() {
        return updator;
    }
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }
}