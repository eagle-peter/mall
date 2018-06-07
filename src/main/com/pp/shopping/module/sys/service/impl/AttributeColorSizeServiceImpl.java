package com.pp.shopping.module.sys.service.impl;

import com.pp.shopping.module.sys.dao.AttributeColorSizeMapper;
import com.pp.shopping.module.sys.model.AttributeColorSize;
import com.pp.shopping.module.sys.service.inter.AttributeColorSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:商品颜色尺寸sku接口实现类
 * @Author: panpeng
 * @Date: 2018/6/4
 */
@Service
public class AttributeColorSizeServiceImpl implements AttributeColorSizeService {

    @Autowired
    AttributeColorSizeMapper attributeColorSizeMapper;

    /**
     * 根据商品id颜色code尺寸code查询商品的价格库存等信息
     * @param goodsId
     * @param colorCode
     * @param sizeCode
     * @return
     */
    @Override
    public AttributeColorSize findByGoodsIdColorCodeSizeCode(Integer goodsId, String colorCode, String sizeCode) {
        return attributeColorSizeMapper.selectByGoodsIdColorCodeSizeCode(goodsId,colorCode,sizeCode);
    }
}
