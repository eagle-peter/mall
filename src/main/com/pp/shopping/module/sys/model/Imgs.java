package com.pp.shopping.module.sys.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:图片
 * @Author: panpeng
 * @Date: 2018/5/25
 */
public class Imgs implements Serializable {

    private Integer id;

    private Integer attributeColorId;

    private String url;

    private Integer type;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Integer creator;

    private Integer updator;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
