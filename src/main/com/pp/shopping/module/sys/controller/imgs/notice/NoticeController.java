package com.pp.shopping.module.sys.controller.imgs.notice;

import com.pp.shopping.module.sys.common.api.ApiResult;
import com.pp.shopping.module.sys.common.api.ApiResultWapper;
import com.pp.shopping.module.sys.common.api.ApiReturnConstant;
import com.pp.shopping.module.sys.model.Notice;
import com.pp.shopping.module.sys.service.inter.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: panpeng
 * @Date: 2018/5/25
 */
@Controller
@RequestMapping(value="/notice")
public class NoticeController {
    private Logger logger = LoggerFactory.getLogger(NoticeController.class);

    @Autowired
    NoticeService noticeService;

    @RequestMapping(value="/recent")
    @ResponseBody
    public ApiResult recent(){
        //查询
        Notice notice = noticeService.findRecent();
        //返回结果
        List<Notice> noticeList = new ArrayList<>();
        noticeList.add(notice);
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("dataList",noticeList);
        ApiResult apiResult = ApiResultWapper.getInstance(resultMap);
        apiResult.setMsg(ApiReturnConstant.SUCCESS);
        return apiResult;
    }

}
