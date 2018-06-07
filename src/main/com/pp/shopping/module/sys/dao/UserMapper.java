/*
 * UserMapper.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户mapper
 */
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(int id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(int id);

    List<User> selectByCondition(User user);

    int updateByPrimaryKeySelective(User record);

}