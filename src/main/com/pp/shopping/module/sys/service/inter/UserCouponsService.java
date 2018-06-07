package com.pp.shopping.module.sys.service.inter;

import com.pp.shopping.module.sys.model.UserCoupons;

import java.util.List;

/**
 * @Description:用户领取优惠券接口
 * @Author: panpeng
 * @Date: 2018/5/28
 */
public interface UserCouponsService {

    /**
     * 查询list
     * @param userCoupons
     * @return
     */
    public List<UserCoupons> findByCondition(UserCoupons userCoupons);

    /**
     * 领取优惠券
     * @param userCoupons
     */
    public void add(UserCoupons userCoupons);

    /**
     * 修改用户优惠券
     * @param userCoupons
     */
    public void edit(UserCoupons userCoupons);
}
