package com.pp.shopping.module.sys.dao;

import com.pp.shopping.module.sys.model.Notice;
import org.springframework.stereotype.Repository;

/**
 * @Description:通知 mapper
 * @Author: panpeng
 * @Date: 2018/5/25
 */
@Repository
public interface NoticeMapper {

    /**
     * 查询最新的通知
     * @return
     */
    public Notice selectRecentNotice();
}
