package com.pp.shopping.module.sys.controller.wechat;

import com.pp.shopping.module.sys.common.proxy.ConstantProxy;
import com.pp.shopping.module.sys.util.HttpUtil;
import com.pp.shopping.module.sys.util.PropertiesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 微信业务Controller
 * @Author: panpeng
 * @Date: 2018/5/31
 */
@RequestMapping(value="/weChat")
@Controller
public class WeChatController {

    private String serviceId = "";

    private String paramsService = "";



    /**
     * 获取access_token
     * @param code
     * @param state
     */
    @RequestMapping(value="/access_token")
    @ResponseBody
    public void getAccessToken(String code,String state){
        //要求传参必须appId放在第一个位置
        String paramsAppId = state.substring(0,state.indexOf("&"));
        paramsService = state.substring(state.indexOf("&")+1);
        serviceId = paramsAppId.split("=")[1];
        /*for(String param:paramsArray){
            String[] paramKeyValue = param.split("=");
            if(ConstantProxy.serviceIdName.equals(paramKeyValue[0])){
                appId = paramKeyValue[1];
                break;
            }

        }*/
        String url = ConstantProxy.WECHAT_ACCESS_TOKEN_URL+"?appid="+ConstantProxy.WECHAT_APPID+"&secret="+ConstantProxy.WECHAT_SECRET+"&code="+code+"&grant_type="+ConstantProxy.WECHAT_AUTHORIZATION_CODE;
        HttpUtil.sendGet(url);
    }
}
