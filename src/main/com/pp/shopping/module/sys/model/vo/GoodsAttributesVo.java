package com.pp.shopping.module.sys.model.vo;

import com.pp.shopping.module.sys.model.GoodsAttribute;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:返回给前端的商品属性VO
 * @Author: panpeng
 * @Date: 2018/5/30
 */
public class GoodsAttributesVo implements Serializable{

    /**
     * 属性名称（颜色，尺寸）
     */
    private String name ;

    private List<GoodsAttribute> attributeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GoodsAttribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<GoodsAttribute> attributeList) {
        this.attributeList = attributeList;
    }
}
