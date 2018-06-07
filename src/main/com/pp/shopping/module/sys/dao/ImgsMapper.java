package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.Imgs;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:图片mapper
 * @Author: panpeng
 * @Date: 2018/5/22
 */
@Repository
public interface ImgsMapper {

    public List<Imgs> selectByCondition(Imgs imgs);
}
