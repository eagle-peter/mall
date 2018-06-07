package com.pp.shopping.module.sys.controller.imgs;

import com.pp.shopping.module.sys.common.constant.Constants;
import com.pp.shopping.module.sys.common.api.ApiResult;
import com.pp.shopping.module.sys.common.api.ApiResultWapper;
import com.pp.shopping.module.sys.common.api.ApiReturnConstant;
import com.pp.shopping.module.sys.model.Imgs;
import com.pp.shopping.module.sys.service.inter.ImgsService;
import com.pp.shopping.module.sys.util.ImgsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description:banner
 * @Author: panpeng
 * @Date: 2018/5/21
 */
@Controller
@RequestMapping("/banner")
public class BannerController <T> {
    private Logger logger = LoggerFactory.getLogger(BannerController.class);


    @Resource
    ImgsService imgsService;

    @RequestMapping(value="/list",method = RequestMethod.GET)
    @ResponseBody
    public ApiResult getBannersForIndex(HttpServletRequest request){

        //查询图片
        Imgs imgs = new Imgs();
        imgs.setType(Constants.IMGS_TYPE_0);
        imgs.setStatus(Constants.STATUS_1);
        List<T> bannersList = (List<T>)imgsService.findImgsByConditions(imgs);

        //设置图片完整路径
        ImgsUtil<T> imgsUtil = new ImgsUtil<>();
        imgsUtil.setAbsoluteUrl(request,bannersList,Constants.IS_IMG_VIDEO_TYPE_1);

        //返回结果
        ApiResult apiResult = ApiResultWapper.getInstance(bannersList);
        apiResult.setMsg(ApiReturnConstant.SUCCESS);
        return apiResult;
    }


}
