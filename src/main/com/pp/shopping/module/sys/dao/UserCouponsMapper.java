package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.UserCoupons;

import java.util.List;

/**
 * @Description:用户领取抽奖券mapper
 * @Author: panpeng
 * @Date: 2018/5/28
 */
public interface UserCouponsMapper {


    /**
     * 查询list
     * @param userCoupons
     * @return
     */
    public List<UserCoupons> selectByCondition(UserCoupons userCoupons);

    /**
     * 插入
     * @param userCoupons
     */
    public void insert(UserCoupons userCoupons);

    /**
     * 修改
     * @param userCoupons
     */
    public void updateByPrimaryKey(UserCoupons userCoupons);
}
