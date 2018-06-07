package com.pp.shopping.module.sys.common.proxy;

import com.pp.shopping.module.sys.util.PropertiesUtil;

/**
 * @Description:代理常量
 * @Author: panpeng
 * @Date: 2018/5/31
 */
public class ConstantProxy {

    public static final String serviceIdName = "appId";

    public static final PropertiesUtil propertiesUtil = new PropertiesUtil("config/init.properties");

    public static final String WECHAT_ACCESS_TOKEN_URL = propertiesUtil.getProperty("wechat.access_token.url");

    public static final String WECHAT_APPID = propertiesUtil.getProperty("wechat.appid");

    public static final String WECHAT_SECRET = propertiesUtil.getProperty("wechat.secret");

    public static final String WECHAT_TOKEN = propertiesUtil.getProperty("wechat.token");

    public static final String WECHAT_AUTHORIZATION_CODE = "authorization_code";


}
