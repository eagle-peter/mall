package com.pp.shopping.module.sys.controller.shop.goods;

import com.pp.shopping.module.sys.common.api.ApiResult;
import com.pp.shopping.module.sys.common.api.ApiResultWapper;
import com.pp.shopping.module.sys.common.api.ApiReturnConstant;
import com.pp.shopping.module.sys.model.Category;
import com.pp.shopping.module.sys.service.inter.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: 商品分类controller
 * @Author: panpeng
 * @Date: 2018/5/25
 */
@Controller
@RequestMapping(value="/shop/goods/category")
public class CategoryController {
    private Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    CategoryService categoryService;


    @RequestMapping(value="/all")
    @ResponseBody
    public ApiResult all(){
        //查询
        List<Category> categoryList = categoryService.findAll();
        //返回结果
        ApiResult apiResult = ApiResultWapper.getInstance(categoryList);
        apiResult.setMsg(ApiReturnConstant.SUCCESS);
        return apiResult;
    }

}
