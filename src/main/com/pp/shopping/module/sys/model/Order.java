/*
 * Order.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 *
 * @author 系统自动生成
 * @version 1.0 2018-04-04
 */
public class Order implements Serializable{

    private int id;
    private String orderNum;
    private int goodsId;
    private int userId;
    /**
     * 发货状态
     */
    private Byte setState;
    private Byte payState;
    /**
     * 收货人
     */
    private int receiver;
    /**
     * 发货时间
     */
    private Date settime;
    /**
     * 收获时间
     */
    private Date gettime;
    /**
     * 联系电话
     */
    private String mobile;
    /**
     * 收货地址
     */
    private int receiveAddress;
    private Date createTime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }
    public int getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public Byte getSetState() {
        return setState;
    }
    public void setSetState(Byte setState) {
        this.setState = setState;
    }
    public Byte getPayState() {
        return payState;
    }
    public void setPayState(Byte payState) {
        this.payState = payState;
    }
    public int getReceiver() {
        return receiver;
    }
    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }
    public Date getSettime() {
        return settime;
    }
    public void setSettime(Date settime) {
        this.settime = settime;
    }
    public Date getGettime() {
        return gettime;
    }
    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
    public int getReceiveAddress() {
        return receiveAddress;
    }
    public void setReceiveAddress(int receiveAddress) {
        this.receiveAddress = receiveAddress;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}