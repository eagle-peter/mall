/*
 * AttributeMapper.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.AttributeColor;
import com.pp.shopping.module.sys.model.AttributeSize;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品尺寸属性mapper
 */
@Repository
public interface AttributeSizeMapper {
    int deleteByPrimaryKey(int id);

    int insert(AttributeSize record);

    AttributeSize selectByPrimaryKey(int id);

    /**
     * 查询商品拥有的尺寸
     * @param goodsId
     * @return
     */
    List<AttributeSize> selectSizeByGoodsId(Integer goodsId);

    int updateByPrimaryKeySelective(AttributeSize record);

}