package com.pp.shopping.module.sys.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:用户领取优惠券的关系
 * @Author: panpeng
 * @Date: 2018/5/28
 */
public class UserCoupons implements Serializable {

    private Integer id;

    private Integer userId;

    private Integer couponsId;

    private Date createTime;

    private Date updateTime;

    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCouponsId() {
        return couponsId;
    }

    public void setCouponsId(Integer couponsId) {
        this.couponsId = couponsId;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
