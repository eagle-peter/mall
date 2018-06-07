package com.pp.shopping.module.sys.controller.discounts;

import com.pp.shopping.module.sys.common.constant.Constants;
import com.pp.shopping.module.sys.common.api.ApiResult;
import com.pp.shopping.module.sys.common.api.ApiResultErrorCode;
import com.pp.shopping.module.sys.common.api.ApiResultWapper;
import com.pp.shopping.module.sys.common.api.ApiReturnConstant;
import com.pp.shopping.module.sys.model.Coupons;
import com.pp.shopping.module.sys.model.User;
import com.pp.shopping.module.sys.model.UserCoupons;
import com.pp.shopping.module.sys.service.inter.CouponsService;
import com.pp.shopping.module.sys.service.inter.UserCouponsService;
import com.pp.shopping.module.sys.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Description:优惠券Controller
 * @Author: panpeng
 * @Date: 2018/5/28
 */
@Controller
@RequestMapping(value="/discounts/coupons")
public class CouponsController {

    @Autowired
    CouponsService couponsService;

    @Autowired
    UserCouponsService userCouponsService;

    @Autowired
    UserService userService;

    /**
     * 查询优惠券list
     * @return
     */
    @RequestMapping(value="/list")
    @ResponseBody
    public ApiResult list(){
        Coupons coupons = new Coupons();
        coupons.setType(Constants.COUPONS_TYPE_1);
        List<Coupons> couponsList = couponsService.findByCondition(coupons);

        ApiResult apiResult = ApiResultWapper.getInstance(couponsList);
        apiResult.setMsg(ApiReturnConstant.SUCCESS);

        return apiResult;
    }

    /**
     * 领取优惠券
     * @return
     */
    @RequestMapping(value="/fetch")
    @ResponseBody
    public ApiResult fetch(Integer couponsId,Integer userId){
        if( null == userId || null ==couponsId){
            return ApiResultErrorCode.resultParamsError();
        }
        Coupons coupons = new Coupons();
        coupons.setId(couponsId);
        List<Coupons> couponsList = couponsService.findByCondition(coupons);
        //参数错误，数据库不存在该id
        if( null == couponsList || couponsList.isEmpty()){
            return ApiResultErrorCode.resultParamsError();
        }
        //优惠券已发完
        if(couponsList.get(0).getCount()<=0){
            return resultCouponsEmpty();
        }
        //优惠券已过期
        if(couponsList.get(0).getStatus() ==Constants.STATUS_0){
            return resultCouponsExpired();
        }
        //已领过
        UserCoupons userCoupons = new UserCoupons();
        userCoupons.setUserId(userId);
        userCoupons.setCouponsId(couponsId);
        List<UserCoupons> userCouponsList = userCouponsService.findByCondition(userCoupons);
        /*if(null != userCouponsList && !userCouponsList.isEmpty()){
            return resultUserCouponsGetted(apiResult);
        }*/
        //用户积分不足
        User user = userService.findByPrimary(userId);
        if(null == user){//无此用户，参数错误
            return ApiResultErrorCode.resultParamsError();
        }
        /*if(user.getMemberPoints().intValue()<couponsList.get(0).getMoneyHreshold().intValue()){//积分不足
            return resultMemberPointsNotEnough();
        }*/
        //领取优惠券
        userGetCoupons(couponsList, userCoupons, userCouponsList, user);

        return resultSuccess();
    }

    /**
     * 返回无data成功结果
     * @return
     */
    private ApiResult resultSuccess() {
        ApiResult apiResult = ApiResultWapper.getVoidInstance();
        apiResult.setCode(ApiReturnConstant.OPERATION_STATUS_SUCCESS);
        apiResult.setMsg(ApiReturnConstant.SUCCESS);
        return apiResult;
    }

    /**
     * 领取优惠券
     * @param couponsList
     * @param userCoupons
     * @param userCouponsList
     * @param user
     */
    private void userGetCoupons(List<Coupons> couponsList, UserCoupons userCoupons, List<UserCoupons> userCouponsList, User user) {
        //领取
        if(null == userCouponsList || userCouponsList.isEmpty()){
            userCoupons.setCount(1);
            userCoupons.setCreateTime(new Date());
            userCoupons.setUpdateTime(new Date());
            userCouponsService.add(userCoupons);
        }else{
            userCoupons.setId(userCouponsList.get(0).getId());
            userCoupons.setCount(userCouponsList.get(0).getCount()+1);
            userCoupons.setUpdateTime(new Date());
            userCouponsService.edit(userCoupons);
        }
        //优惠券数目减1
        Coupons coupons = couponsList.get(0);
        coupons.setCount(coupons.getCount()-1);
        couponsService.edit(coupons);
        //扣除相应积分
        /*user.setMemberPoints(user.getMemberPoints()-coupons.getMoneyHreshold());
        user.setUpdateTime(new Date());
        userService.edit(user);*/
    }

    /**
     * 返回用户积分不足
     * @return
     */
    private ApiResult resultMemberPointsNotEnough() {
        ApiResult apiResult = ApiResultWapper.getVoidInstance();
        apiResult.setCode(ApiReturnConstant.OPERATION_STATUS_FAILUE);
        apiResult.setErrCode(ApiResultErrorCode.MEMBER_POINTS_NOT_ENOUGH_104);
        apiResult.setMsg(ApiResultErrorCode.MEMBER_POINTS_NOT_ENOUGH);
        return apiResult;
    }

    /**
     * 返回优惠券已领
     * @return
     */
    private ApiResult resultUserCouponsGetted() {
        ApiResult apiResult = ApiResultWapper.getVoidInstance();
        apiResult.setCode(ApiReturnConstant.OPERATION_STATUS_FAILUE);
        apiResult.setErrCode(ApiResultErrorCode.USER_COUPONS_GETTED_103);
        apiResult.setMsg(ApiResultErrorCode.USER_COUPONS_GETTED);
        return apiResult;
    }

    /**
     * 返回优惠券过期
     * @return
     */
    private ApiResult resultCouponsExpired() {
        ApiResult apiResult = ApiResultWapper.getVoidInstance();
        apiResult.setCode(ApiReturnConstant.OPERATION_STATUS_FAILUE);
        apiResult.setErrCode(ApiResultErrorCode.COUPONS_EXPIRED_105);
        apiResult.setMsg(ApiResultErrorCode.COUPONS_EXPIRED);
        return apiResult;
    }

    /**
     * 返回优惠券已发完
     * @return
     */
    private ApiResult resultCouponsEmpty() {
        ApiResult apiResult = ApiResultWapper.getVoidInstance();
        apiResult.setCode(ApiReturnConstant.OPERATION_STATUS_FAILUE);
        apiResult.setErrCode(ApiResultErrorCode.COUPONS_EMPTY_102);
        apiResult.setMsg(ApiResultErrorCode.COUPONS_EMPTY);
        return apiResult;
    }

}
