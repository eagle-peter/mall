package com.pp.shopping.module.sys.util;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.*;

/**
 * @Description: 图片视频工具类
 * @Author: panpeng
 * @Date: 2018/5/25
 */
public class ImgsUtil<T> {
    private Logger logger = LoggerFactory.getLogger(ImgsUtil.class);

    private final String readImgUrl = "/imgsCommon/readImg.do";

    private static List<String> urlList = new ArrayList<>();

    static{
        urlList.add("url");
        urlList.add("coverImgUrl");
    }
    /**
     * 设置图片(视频)的完整路径
     * @param request
     * @param list
     * @param type
     */
    public  void setAbsoluteUrl(HttpServletRequest request, List<T> list,Integer type){
        String projectUrl = request.getScheme()+"://"+ request.getServerName()+":"+request.getServerPort()+request.getContextPath();
        for(T t:list){
            String url = "";
            for (Field f:t.getClass().getDeclaredFields()){
                if(urlList.contains(f.getName())){
                    f.setAccessible(true);
                    try {
                        url = f.get(t).toString();
                    } catch (IllegalAccessException e) {
                        logger.debug("获取url失败："+e.getMessage());
                    }
                    if(StringUtils.isNotEmpty(url)){
                        try {
                            f.set(t,projectUrl+readImgUrl+"?url="+ URLEncoder.encode(url,"utf8")+"&type="+ type);
                        } catch (IllegalAccessException e) {
                            logger.debug("设置url失败："+e.getMessage());
                        }catch (UnsupportedEncodingException e) {
                            logger.debug("url编码失败:"+e.getMessage());
                        }
                    }
                    break;
                }
            }
        }
    }

    /**
     * 设置图片(视频)的完整路径（数组转list）
     * @param request
     * @param urls
     * @param type
     */
    public List<String> setAbsoluteUrl(HttpServletRequest request, String urls,Integer type){
        String projectUrl = request.getScheme()+"://"+ request.getServerName()+":"+request.getServerPort()+request.getContextPath();
        String[] urlsArray = urls.split(",");
        List<String> urlList = Arrays.asList(urlsArray);
        for(int i = 0;i<urlList.size();i++){

            try {
                urlList.set(i, projectUrl+readImgUrl+"?url="+ URLEncoder.encode(urlList.get(i),"utf8")+"&type="+ type);
            } catch (UnsupportedEncodingException e) {
                logger.debug("url编码失败:"+e.getMessage());;
            }
        }
        return urlList;
    }
}
