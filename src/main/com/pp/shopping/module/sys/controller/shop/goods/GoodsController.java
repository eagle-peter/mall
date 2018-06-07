package com.pp.shopping.module.sys.controller.shop.goods;

import com.pp.shopping.module.sys.common.constant.Constants;
import com.pp.shopping.module.sys.common.api.ApiResult;
import com.pp.shopping.module.sys.common.api.ApiResultErrorCode;
import com.pp.shopping.module.sys.common.api.ApiResultWapper;
import com.pp.shopping.module.sys.common.api.ApiReturnConstant;
import com.pp.shopping.module.sys.model.*;
import com.pp.shopping.module.sys.model.vo.GoodsAttributesVo;
import com.pp.shopping.module.sys.service.inter.AttributeColorSizeService;
import com.pp.shopping.module.sys.service.inter.GoodsService;
import com.pp.shopping.module.sys.util.ImgsUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Description: 商品Controller
 * @Author: panpeng
 * @Date: 2018/5/24
 */
@Controller
@RequestMapping(value="/shop/goods")
public class GoodsController<T> {
    private Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    GoodsService goodsService;

    @Autowired
    AttributeColorSizeService attributeColorSizeService;

    /**
     * 查询商品list
     * @param request
     * @param categoryId
     * @param nameLike
     * @return
     */
    @RequestMapping(value="/list")
    @ResponseBody
    public ApiResult list(HttpServletRequest request,Integer categoryId, String nameLike){
        //查询商品
        List<T> goodsList = (List<T>)goodsService.findByCategoryIdAndNamelike(categoryId, nameLike);

        //设置图片完整路径
        ImgsUtil<T> imgsUtil = new ImgsUtil<>();
        imgsUtil.setAbsoluteUrl(request,goodsList, Constants.IS_IMG_VIDEO_TYPE_1);

        //返回结果
        ApiResult apiResult = ApiResultWapper.getInstance(goodsList);
        apiResult.setMsg(ApiReturnConstant.SUCCESS);

        return apiResult;
    }


    /**
     * 查询商品详情
     * @return
     */
    @RequestMapping(value="/detail")
    @ResponseBody
    public ApiResult detail(Integer id,HttpServletRequest request){
        Goods goodsDetails = goodsService.findDetailsById(id);
        if(null == goodsDetails){
            ApiResultErrorCode.resultParamsError();
        }
        //url转换
        convertUrls(request, goodsDetails);
        
        //设置属性
        List<GoodsAttributesVo> attributesVoList = new ArrayList<>();
        GoodsAttributesVo colorVo = new GoodsAttributesVo();
        GoodsAttributesVo sizeVo = new GoodsAttributesVo();
        attributesVoList.add(colorVo);
        attributesVoList.add(sizeVo);

        colorVo.setName("颜色");
        sizeVo.setName("尺寸");

        //设置颜色和尺寸List
        setColorSizeList(goodsDetails, colorVo, sizeVo);


        Map<String,Object> dataMap = new HashMap<>();
        //设置content
        String content = setContent(goodsDetails);
        //返回结果
        dataMap.put("properties",attributesVoList);
        dataMap.put("content",content);
        dataMap.put("basicInfo",goodsDetails);
        ApiResult apiResult = ApiResultWapper.getInstance(dataMap);
        apiResult.setMsg(ApiReturnConstant.SUCCESS);
        return  apiResult;
    }

    /**
     * 设置颜色和尺寸List
     * @param goodsDetails
     * @param colorVo
     * @param sizeVo
     */
    private void setColorSizeList(Goods goodsDetails, GoodsAttributesVo colorVo, GoodsAttributesVo sizeVo) {

        List<AttributeColor> attributeColorList = goodsDetails.getAttributeColorList();
        List<AttributeSize> attributeSizeList = goodsDetails.getAttributeSizeList();

        List<GoodsAttribute> colorList = new ArrayList<>();
        List<GoodsAttribute> sizeList = new ArrayList<>();
        for(AttributeColor attributeColor:attributeColorList){
            GoodsAttribute goodsAttribute = new GoodsAttribute();
            goodsAttribute.setName(attributeColor.getName());
            goodsAttribute.setCode(attributeColor.getColorCode());
            colorList.add(goodsAttribute);
        }
        for(AttributeSize attributeSize:attributeSizeList){
            GoodsAttribute goodsAttribute = new GoodsAttribute();
            goodsAttribute.setName(attributeSize.getName());
            goodsAttribute.setCode(attributeSize.getSizeCode());
            sizeList.add(goodsAttribute);
        }
        colorVo.setAttributeList(colorList);
        sizeVo.setAttributeList(sizeList);
    }

    /**
     * 设置属性list
     * @param attributeList
     * @param codesArray
     * @param namesArray
     */
    private void setAttributeList(List<GoodsAttribute> attributeList,String[] codesArray, String[] namesArray) {
        for(int i=0;i<codesArray.length;i++){
            GoodsAttribute goodsAttribute = new GoodsAttribute();
            goodsAttribute.setCode(codesArray[i]);
            goodsAttribute.setName(namesArray[i]);
            attributeList.add(goodsAttribute);
        }
    }

    /**
     * 设置content作为页面的产品介绍
     * @param goodDetails
     * @return
     */
    private String setContent(Goods goodDetails){
        String content = "";
        List<String> descriptionUrlList = goodDetails.getDescriptionUrlList();
        if(null != descriptionUrlList && !descriptionUrlList.isEmpty()){
            String[] desImgNameArray = goodDetails.getDescriptionUrls().split(",");
            for(int i = 0 ;i< descriptionUrlList.size();i++){
                content += "<p><img src=\"" + descriptionUrlList.get(i) + "\" title=\""+desImgNameArray[i] +"\" alt=\"微信图片_"+desImgNameArray[i]+"\"/></p>";
            }
            String description = goodDetails.getName()+","+goodDetails.getCharacteristic();
            content  = content + "<p>"+description+"</p>";
        }
        return content;
    }

    /**
     * url转换
     * @param request
     * @param goodsDetails
     */
    private void convertUrls(HttpServletRequest request, Goods goodsDetails) {
        String videoUrl = goodsDetails.getVideoUrl();
        String coverImgUrl = goodsDetails.getCoverImgUrl();
        String bannerUrls = goodsDetails.getBannerUrls();
        String descriptionUrls = goodsDetails.getDescriptionUrls();
        ImgsUtil<T> imgsUtil = new ImgsUtil<>();
        //视频
        if(StringUtils.isNotEmpty(videoUrl)){
            goodsDetails.setVideoUrl(imgsUtil.setAbsoluteUrl(request,videoUrl, Constants.IS_IMG_VIDEO_TYPE_2).get(0));
        }
        //封面
        if(StringUtils.isNotEmpty(coverImgUrl)){
            goodsDetails.setCoverImgUrl(imgsUtil.setAbsoluteUrl(request,coverImgUrl, Constants.IS_IMG_VIDEO_TYPE_1).get(0));
        }
        //banner
        if(StringUtils.isNotEmpty(bannerUrls)){
            goodsDetails.setBannerUrlList(imgsUtil.setAbsoluteUrl(request,bannerUrls, Constants.IS_IMG_VIDEO_TYPE_1));
        }
        //描述
        if(StringUtils.isNotEmpty(descriptionUrls)){
            goodsDetails.setDescriptionUrlList(imgsUtil.setAbsoluteUrl(request,descriptionUrls, Constants.IS_IMG_VIDEO_TYPE_1));
        }
    }

    /**
     * 获取商品的价格
     * @return
     */
    @RequestMapping(value="/price")
    @ResponseBody
    public ApiResult price(Integer goodsId,String propertyChildIds){
        String[] propertiesArray = propertyChildIds.split(",");
        String colorCode = propertiesArray[0].split(":")[1];
        String sizeCode = propertiesArray[1].split(":")[1];
        AttributeColorSize attributeColorSize = attributeColorSizeService.findByGoodsIdColorCodeSizeCode(goodsId, colorCode, sizeCode);
        ApiResult apiResult = null;
        if( null == attributeColorSize || attributeColorSize.getStock().intValue() <=0){
            attributeColorSize = new AttributeColorSize();
            attributeColorSize.setStock(0);
            apiResult = ApiResultWapper.getInstance(attributeColorSize);
        }else{
            apiResult = ApiResultWapper.getInstance(attributeColorSize);
        }
        apiResult.setMsg(ApiReturnConstant.SUCCESS);
        return apiResult;
    }
}
