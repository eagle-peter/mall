/*
 * AttributeMapper.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.AttributeColor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品颜色属性mapper
 */
@Repository
public interface AttributeColorMapper {
    int deleteByPrimaryKey(int id);

    int insert(AttributeColor record);

    AttributeColor selectByPrimaryKey(int id);

    /**
     * 查询商品拥有的颜色
     * @param goodsId
     * @return
     */
    List<AttributeColor> selectColorsByGoodsId(Integer goodsId);

    int updateByPrimaryKeySelective(AttributeColor record);

}