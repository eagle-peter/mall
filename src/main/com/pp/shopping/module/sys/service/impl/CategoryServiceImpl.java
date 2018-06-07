package com.pp.shopping.module.sys.service.impl;

import com.pp.shopping.module.sys.dao.CategoryMapper;
import com.pp.shopping.module.sys.model.Category;
import com.pp.shopping.module.sys.service.inter.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:商品分类接口实现类
 * @Author: panpeng
 * @Date: 2018/5/25
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    /**
     * 查询商品的所有分类list
     * @return
     */
    @Override
    public List<Category> findAll() {
        return categoryMapper.selectAll();
    }
}
