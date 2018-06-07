/*
 * CartMapper.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.Cart;
import org.springframework.stereotype.Repository;

/**
 * 购物车mapper
 */
@Repository
public interface CartMapper {
    int deleteByPrimaryKey(int id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}