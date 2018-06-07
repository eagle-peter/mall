package com.pp.shopping.module.sys.service.inter;

import com.pp.shopping.module.sys.model.Notice;

/**
 * @Description:通知业务接口
 * @Author: panpeng
 * @Date: 2018/5/25
 */
public interface NoticeService {

    /**
     * 查询最新通知
     * @return
     */
    public Notice findRecent();
}
