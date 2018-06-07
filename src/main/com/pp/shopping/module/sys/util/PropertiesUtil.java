package com.pp.shopping.module.sys.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Description:
 * @Author: panpeng
 * @Date: 2018/4/19
 */
public class PropertiesUtil {

    private Properties props;

    public PropertiesUtil(String fileName){
        readProperties(fileName);
    }
    private void readProperties(String fileName) {
        try {
            props = new Properties();
            InputStream fis =PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName);
            props.load(new BufferedReader(new InputStreamReader(fis)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取某个属性
     */
    public String getProperty(String key){
        return props.getProperty(key);
    }
    /**
     * 获取所有属性，返回一个map,不常用
     * 可以试试props.putAll(t)
     */
    public Map getAllProperty(){
        Map map=new HashMap();
        Enumeration enu = props.propertyNames();
        while (enu.hasMoreElements()) {
            String key = (String) enu.nextElement();
            String value = props.getProperty(key);
            map.put(key, value);
        }
        return map;
    }
    /**
     * 在控制台上打印出所有属性，调试时用。
     */
    public void printProperties(){
        props.list(System.out);
    }
}
