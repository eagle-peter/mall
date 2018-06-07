/*
 * Goods.java
 * Copyright(C) 2016-2025  捷远公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-04-04 Created
 */
package com.pp.shopping.module.sys.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 商品
 *
 * @author 系统自动生成
 * @version 1.0 2018-04-04
 */
public class Goods implements Serializable{

    private int id;
    /**
     * 分类
     */
    private int categoryId;
    /**
     * 名称
     */
    private String name;
    /**
     * 是否上架
     */
    private Integer isSale;

    private Date createTime;

    private Integer creator;

    private Date updateTime;

    private Integer updator;

    private Integer brandId;

    private Integer isNewStyle;

    private Integer isHotStyle;

    private Double originalPrice;

    private Integer isPromoted;

    private Integer countSold;

    private Integer coverImgId;

    private Double minPrice;

    private String coverImgUrl;

    private Integer rewardType;

    private Integer reward;

    private Integer numberGoodReputation;

    private Integer videoId;

    private String characteristic;

    private String videoUrl;

    private String bannerUrls;

    private List<String > bannerUrlList;

    private String descriptionUrls;

    private List<String> descriptionUrlList;

    private String colorCodes;

    private List<AttributeColor> attributeColorList;

    private String colorNames;

    private String sizeCodes;

    private List<AttributeSize> attributeSizeList;

    private String sizeNames;

    private Integer stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsSale() {
        return isSale;
    }

    public void setIsSale(Integer isSale) {
        this.isSale = isSale;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdator() {
        return updator;
    }

    public void setUpdator(Integer updator) {
        this.updator = updator;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getIsNewStyle() {
        return isNewStyle;
    }

    public void setIsNewStyle(Integer isNewStyle) {
        this.isNewStyle = isNewStyle;
    }

    public Integer getIsHotStyle() {
        return isHotStyle;
    }

    public void setIsHotStyle(Integer isHotStyle) {
        this.isHotStyle = isHotStyle;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getIsPromoted() {
        return isPromoted;
    }

    public void setIsPromoted(Integer isPromoted) {
        this.isPromoted = isPromoted;
    }

    public Integer getCountSold() {
        return countSold;
    }

    public void setCountSold(Integer countSold) {
        this.countSold = countSold;
    }

    public Integer getCoverImgId() {
        return coverImgId;
    }

    public void setCoverImgId(Integer coverImgId) {
        this.coverImgId = coverImgId;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Integer getNumberGoodReputation() {
        return numberGoodReputation;
    }

    public void setNumberGoodReputation(Integer numberGoodReputation) {
        this.numberGoodReputation = numberGoodReputation;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getBannerUrls() {
        return bannerUrls;
    }

    public void setBannerUrls(String bannerUrls) {
        this.bannerUrls = bannerUrls;
    }

    public String getDescriptionUrls() {
        return descriptionUrls;
    }

    public void setDescriptionUrls(String descriptionUrls) {
        this.descriptionUrls = descriptionUrls;
    }

    public List<String> getBannerUrlList() {
        return bannerUrlList;
    }

    public void setBannerUrlList(List<String> bannerUrlList) {
        this.bannerUrlList = bannerUrlList;
    }

    public List<String> getDescriptionUrlList() {
        return descriptionUrlList;
    }

    public void setDescriptionUrlList(List<String> descriptionUrlList) {
        this.descriptionUrlList = descriptionUrlList;
    }

    public String getColorCodes() {
        return colorCodes;
    }

    public void setColorCodes(String colorCodes) {
        this.colorCodes = colorCodes;
    }

    public String getColorNames() {
        return colorNames;
    }

    public void setColorNames(String colorNames) {
        this.colorNames = colorNames;
    }

    public String getSizeCodes() {
        return sizeCodes;
    }

    public void setSizeCodes(String sizeCodes) {
        this.sizeCodes = sizeCodes;
    }

    public String getSizeNames() {
        return sizeNames;
    }

    public void setSizeNames(String sizeNames) {
        this.sizeNames = sizeNames;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<AttributeColor> getAttributeColorList() {
        return attributeColorList;
    }

    public void setAttributeColorList(List<AttributeColor> attributeColorList) {
        this.attributeColorList = attributeColorList;
    }

    public List<AttributeSize> getAttributeSizeList() {
        return attributeSizeList;
    }

    public void setAttributeSizeList(List<AttributeSize> attributeSizeList) {
        this.attributeSizeList = attributeSizeList;
    }
}