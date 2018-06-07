package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.Coupons;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:优惠券mapper
 * @Author: panpeng
 * @Date: 2018/5/28
 */
@Repository
public interface CouponsMapper {


    /**
     * 查询优惠券list
     * @param coupons
     * @return
     */
    public List<Coupons> selectByCondition(Coupons coupons);

    /**
     * 根据主键修改
     * @param coupons
     */
    public void updateByPrimaryKey(Coupons coupons);
}
