/*
 * ReceiveAddressMapper.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.ReceiveAddress;
import org.springframework.stereotype.Repository;

/**
 * 收获地址mapper
 */
@Repository
public interface ReceiveAddressMapper {
    int deleteByPrimaryKey(long id);

    int insert(ReceiveAddress record);

    int insertSelective(ReceiveAddress record);

    ReceiveAddress selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(ReceiveAddress record);

    int updateByPrimaryKey(ReceiveAddress record);
}