package com.pp.shopping.module.sys.controller.imgs;

import com.pp.shopping.module.sys.common.constant.Constants;
import com.pp.shopping.module.sys.util.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @Description:
 * @Author: panpeng
 * @Date: 2018/5/23
 */
@Controller
@RequestMapping(value="/imgsCommon")
public class ImgsCommonController {
    private Logger logger = LoggerFactory.getLogger(ImgsCommonController.class);

    private  final String IMG_DIRECTORY = "img.uploadpath.directory";
    private  final String VIDEO_DIRECTORY = "video.uploadpath.directory";


    @RequestMapping(value="/readImg",method = RequestMethod.GET)
    public void readImg(String url, HttpServletResponse response,Integer type){
        String absolutePath = "";
        PropertiesUtil propertiesUtil = new PropertiesUtil("config/init.properties");
        if(type.intValue() == Constants.IS_IMG_VIDEO_TYPE_1){
            absolutePath = propertiesUtil.getProperty(IMG_DIRECTORY)+ File.separator+url;
        }else if(type.intValue() == Constants.IS_IMG_VIDEO_TYPE_2){
            absolutePath = propertiesUtil.getProperty(VIDEO_DIRECTORY)+ File.separator+url;
        }


        BufferedInputStream bis = null;
        OutputStream os = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(absolutePath));
            os =  response.getOutputStream();
            byte[] buffer = new byte[1024*1024];
            int count = 0;
            while((count = bis.read(buffer)) != -1){
                os.write(buffer,0,count);
                os.flush();
            }
        } catch (FileNotFoundException e) {
            logger.debug("读取文件失败："+e.getMessage());
        } catch (IOException e) {
            logger.debug(e.getMessage());
        }finally {
            if( null != bis){
                try {
                    bis.close();
                } catch (IOException e) {
                    logger.debug("关闭流bis失败："+e.getMessage());
                }
            }
            if(null != os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.debug("关闭流os失败："+e.getMessage());
                }
            }
        }

    }
}
