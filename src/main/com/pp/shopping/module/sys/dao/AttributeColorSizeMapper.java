package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.AttributeColorSize;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:商品颜色尺寸sku mapper
 * @Author: panpeng
 * @Date: 2018/6/4
 */
public interface AttributeColorSizeMapper {

    /**
     * 根据商品id颜色code尺寸code查询商品的价格库存等信息
     * @param goodsId
     * @param colorCode
     * @param sizeCode
     * @return
     */
    public AttributeColorSize selectByGoodsIdColorCodeSizeCode(@Param("goodsId") Integer goodsId,@Param("colorCode") String colorCode,@Param("sizeCode") String sizeCode);
}
