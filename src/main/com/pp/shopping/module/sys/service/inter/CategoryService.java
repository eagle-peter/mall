package com.pp.shopping.module.sys.service.inter;

import com.pp.shopping.module.sys.model.Category;

import java.util.List;

/**
 * @Description:商品分类接口
 * @Author: panpeng
 * @Date: 2018/5/25
 */
public interface CategoryService {

    /**
     * 查询商品的所有分类list
     * @return
     */
    public List<Category> findAll();
}
