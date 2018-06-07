/*
 * OrderMapper.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.Order;
import org.springframework.stereotype.Repository;

/**
 * 订单mapper
 */
@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(int id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}