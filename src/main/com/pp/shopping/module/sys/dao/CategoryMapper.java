/*
 * CategoryMapper.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品分类mapper
 */
@Repository
public interface CategoryMapper {
    int deleteByPrimaryKey(int id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(int id);

    /**
     * 查询商品的所有分类list
     * @return
     */
    List<Category> selectAll();

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}