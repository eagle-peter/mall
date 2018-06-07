package com.pp.shopping.module.sys.service.inter;

import com.pp.shopping.module.sys.model.Coupons;

import java.util.List;

/**
 * @Description:优惠券接口
 * @Author: panpeng
 * @Date: 2018/5/28
 */
public interface CouponsService {

    /**
     * 查询优惠券list
     * @param coupons
     * @return
     */
    public List<Coupons>  findByCondition(Coupons coupons);

    /**
     * 修改
     * @param coupons
     */
    public void edit(Coupons coupons);
}
