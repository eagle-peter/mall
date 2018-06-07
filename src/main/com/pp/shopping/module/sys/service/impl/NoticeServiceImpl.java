package com.pp.shopping.module.sys.service.impl;

import com.pp.shopping.module.sys.dao.NoticeMapper;
import com.pp.shopping.module.sys.model.Notice;
import com.pp.shopping.module.sys.service.inter.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 通知业务接口实现类
 * @Author: panpeng
 * @Date: 2018/5/25
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    NoticeMapper noticeMapper;

    /**
     * 查询最新通知
     * @return
     */
    @Override
    public Notice findRecent() {
        return noticeMapper.selectRecentNotice();
    }
}
