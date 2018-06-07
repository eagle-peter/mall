package com.pp.shopping.module.sys.service.impl;

import com.pp.shopping.module.sys.dao.ImgsMapper;
import com.pp.shopping.module.sys.model.Imgs;
import com.pp.shopping.module.sys.service.inter.ImgsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:图片业务接口实现类
 * @Author: panpeng
 * @Date: 2018/5/22
 */
@Service
public class ImgsServiceImpl implements ImgsService {

    @Resource
    ImgsMapper imgsMapper;

    public List<Imgs> findImgsByConditions(Imgs imgs) {
        return imgsMapper.selectByCondition(imgs);
    }
}
