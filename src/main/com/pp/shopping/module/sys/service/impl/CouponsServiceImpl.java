package com.pp.shopping.module.sys.service.impl;

import com.pp.shopping.module.sys.dao.CouponsMapper;
import com.pp.shopping.module.sys.model.Coupons;
import com.pp.shopping.module.sys.service.inter.CouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:优惠券接口实现类
 * @Author: panpeng
 * @Date: 2018/5/28
 */
@Service
public class CouponsServiceImpl implements CouponsService{

    @Autowired
    CouponsMapper couponsMapper;

    /**
     * 查询list
     * @param coupons
     * @return
     */
    @Override
    public List<Coupons> findByCondition(Coupons coupons) {
        return couponsMapper.selectByCondition(coupons);
    }

    /**
     * 修改
     * @param coupons
     */
    @Override
    public void edit(Coupons coupons) {
        couponsMapper.updateByPrimaryKey(coupons);
    }
}
