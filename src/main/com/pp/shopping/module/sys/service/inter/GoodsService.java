package com.pp.shopping.module.sys.service.inter;

import com.pp.shopping.module.sys.model.Goods;

import java.util.List;

/**
 * @Description:商品业务接口
 * @Author: panpeng
 * @Date: 2018/5/25
 */
public interface GoodsService {

    /**
     * 根据商品分类和商品模糊名称  查询商品list
     * @param categoryId 商品分类id
     * @param nameLike 商品模糊名称
     * @return
     */
    public List<Goods> findByCategoryIdAndNamelike(Integer categoryId, String nameLike);

    /**
     * 查询商品详情
     * @param id
     * @return
     */
    public Goods findDetailsById(Integer id);
}
