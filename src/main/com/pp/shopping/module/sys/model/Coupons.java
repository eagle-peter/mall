package com.pp.shopping.module.sys.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 优惠券
 * @Author: panpeng
 * @Date: 2018/5/28
 */
public class Coupons implements Serializable{

    private Integer id;

    private String name;

    private Integer type;

    private Integer count;

    private Integer moneyMax;

    private Integer moneyHreshold;

    private Integer dateEndType;

    private Date dateEnd;

    private Integer dateEndDays;

    private Integer status;

    private Date createTime;

    private Integer creator;

    private Date updateTime;

    private Integer updator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMoneyMax() {
        return moneyMax;
    }

    public void setMoneyMax(Integer moneyMax) {
        this.moneyMax = moneyMax;
    }

    public Integer getMoneyHreshold() {
        return moneyHreshold;
    }

    public void setMoneyHreshold(Integer moneyHreshold) {
        this.moneyHreshold = moneyHreshold;
    }

    public Integer getDateEndType() {
        return dateEndType;
    }

    public void setDateEndType(Integer dateEndType) {
        this.dateEndType = dateEndType;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getDateEndDays() {
        return dateEndDays;
    }

    public void setDateEndDays(Integer dateEndDays) {
        this.dateEndDays = dateEndDays;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdator() {
        return updator;
    }

    public void setUpdator(Integer updator) {
        this.updator = updator;
    }
}
