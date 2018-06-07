/*
 * GoodsMapper.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品mapper
 */
@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(int id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(int id);

    /**
     * 根据商品分类和商品模糊名称  查询商品list
     * @param categoryId 商品分类id
     * @param nameLike 商品模糊名称
     * @return
     */
    List<Goods> selectListByCategoryIdAndNameLike(@Param("categoryId") Integer categoryId, @Param("nameLike") String nameLike);

    /**
     * 查询商品详情
     * @param id
     * @return
     */
    Goods selectDetailsByGoodsId(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}