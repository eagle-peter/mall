package com.pp.shopping.module.sys.service.impl;

import com.pp.shopping.module.sys.dao.UserCouponsMapper;
import com.pp.shopping.module.sys.model.UserCoupons;
import com.pp.shopping.module.sys.service.inter.UserCouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:用户领取优惠券接口实现类
 * @Author: panpeng
 * @Date: 2018/5/28
 */
@Service
public class UserCouponsServiceImpl implements UserCouponsService {

    @Autowired
    UserCouponsMapper userCouponsMapper;

    /**
     * 查询list
     * @param userCoupons
     * @return
     */
    @Override
    public List<UserCoupons> findByCondition(UserCoupons userCoupons) {
        return userCouponsMapper.selectByCondition(userCoupons);
    }

    /**
     * 插入
     * @param userCoupons
     */
    @Override
    public void add(UserCoupons userCoupons) {
        userCouponsMapper.insert(userCoupons);
    }

    /**
     * 修改
     * @param userCoupons
     */
    @Override
    public void edit(UserCoupons userCoupons) {
        userCouponsMapper.updateByPrimaryKey(userCoupons);
    }
}
