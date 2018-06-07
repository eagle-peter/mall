package com.pp.shopping.module.sys.service.inter;

import com.pp.shopping.module.sys.model.AttributeColorSize;

/**
 * @Description:商品的颜色尺寸sku接口
 * @Author: panpeng
 * @Date: 2018/6/4
 */
public interface AttributeColorSizeService {


    /**
     * 根据商品id颜色code尺寸code查询商品的价格库存等信息
     * @return
     */
    public AttributeColorSize findByGoodsIdColorCodeSizeCode(Integer goodsId,String colorCode,String sizeCode);
}
