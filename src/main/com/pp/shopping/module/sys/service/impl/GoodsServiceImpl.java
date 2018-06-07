package com.pp.shopping.module.sys.service.impl;

import com.pp.shopping.module.sys.dao.AttributeColorMapper;
import com.pp.shopping.module.sys.dao.AttributeSizeMapper;
import com.pp.shopping.module.sys.dao.GoodsMapper;
import com.pp.shopping.module.sys.model.AttributeColor;
import com.pp.shopping.module.sys.model.AttributeSize;
import com.pp.shopping.module.sys.model.Goods;
import com.pp.shopping.module.sys.service.inter.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:商品业务接口实现类
 * @Author: panpeng
 * @Date: 2018/5/25
 */
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    AttributeColorMapper attributeColorMapper;
    @Autowired
    AttributeSizeMapper attributeSizeMapper;


    /**
     * 根据商品分类和商品模糊名称  查询商品list
     * @param categoryId 商品分类id
     * @param nameLike 商品模糊名称
     * @return
     */
    @Override
    public List<Goods> findByCategoryIdAndNamelike(Integer categoryId, String nameLike) {
        return goodsMapper.selectListByCategoryIdAndNameLike(categoryId,nameLike);
    }

    /**
     * 查询商品详情
     * @param id
     * @return
     */
    @Override
    public Goods findDetailsById(Integer id) {
        Goods goods = goodsMapper.selectDetailsByGoodsId(id);
        List<AttributeColor> attributeColorList = attributeColorMapper.selectColorsByGoodsId(id);
        List<AttributeSize> attributeSizeList = attributeSizeMapper.selectSizeByGoodsId(id);
        goods.setAttributeColorList(attributeColorList);
        goods.setAttributeSizeList(attributeSizeList);
        return goods;
    }
}
