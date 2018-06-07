/*
 * CartItemMapper.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.CartItem;
import org.springframework.stereotype.Repository;

/**
 * 购物车item Mapper
 */
@Repository
public interface CartItemMapper {
    int deleteByPrimaryKey(int id);

    int insert(CartItem record);

    int insertSelective(CartItem record);

    CartItem selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(CartItem record);

    int updateByPrimaryKey(CartItem record);
}