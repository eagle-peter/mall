package com.pp.shopping.module.sys.controller;

import com.pp.shopping.module.sys.common.api.ApiResult;
import com.pp.shopping.module.sys.common.api.ApiResultWapper;
import com.pp.shopping.module.sys.common.api.ApiReturnConstant;
import com.pp.shopping.module.sys.util.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Description:mallName 项目中文名
 * @Author: panpeng
 * @Date: 2018/5/24
 */
@RequestMapping(value="/mallName")
@Controller
public class MallNameController {
    private Logger logger = LoggerFactory.getLogger(MallNameController.class);

    private final String  MALLNAME_CONFIG = "mall.name";


    /**
     * 获取项目中文名
     * @return
     */
    @RequestMapping(value="/getMallName",method= RequestMethod.GET)
    @ResponseBody
    public ApiResult getMallName(){
        ApiResult apiResult = null;
        PropertiesUtil propertiesUtil = new PropertiesUtil("config/init.properties");
        try {
            String name = new String(propertiesUtil.getProperty(MALLNAME_CONFIG).getBytes("iso-8859-1"));
            apiResult = ApiResultWapper.getInstance(name);
        } catch (UnsupportedEncodingException e) {
            logger.debug("获取mallName失败："+e.getMessage());
        }
        apiResult.setMsg(ApiReturnConstant.SUCCESS);
        return apiResult;
    }

    public static void main (String[]args){
        PropertiesUtil propertiesUtil = new PropertiesUtil("config/init.properties");
        String name = null;
        try {
            name = new String(propertiesUtil.getProperty("mall.name").getBytes("iso-8859-1"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(name);

    }
}
