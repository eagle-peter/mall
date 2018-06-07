package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.Video;

/**
 * @Description:视频mapper
 * @Author: panpeng
 * @Date: 2018/5/29
 */
public interface VideoMapper {

    /**
     * 根据主键查询
     * @param id 主键id
     * @return
     */
    public Video selectByPrimaryKey(Integer id);
}
