package com.pp.shopping.module.sys.service.inter;

import com.pp.shopping.module.sys.model.Imgs;

import java.util.List;

/**
 * @Description:图片业务接口
 * @Author: panpeng
 * @Date: 2018/5/22
 */
public interface ImgsService {

    List<Imgs> findImgsByConditions(Imgs imgs);
}
