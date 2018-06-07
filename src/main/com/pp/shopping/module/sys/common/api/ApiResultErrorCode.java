package com.pp.shopping.module.sys.common.api;

/**
 * @Description:返回结果错误信息码
 * @Author: panpeng
 * @Date: 2018/5/28
 */
public class ApiResultErrorCode {

    public static final int PARAMS_ERROR_101 = 101;

    public static final String PARAMS_ERROR = "参数错误";

    public static final int COUPONS_EMPTY_102 = 102;

    public static final String COUPONS_EMPTY = "优惠券已发完";

    public static final int USER_COUPONS_GETTED_103 = 103;

    public static final String USER_COUPONS_GETTED = "用户已领取优惠券";

    public static final int MEMBER_POINTS_NOT_ENOUGH_104 = 104;

    public static final String MEMBER_POINTS_NOT_ENOUGH = "用户积分不足";

    public static final int COUPONS_EXPIRED_105 = 105;

    public static final String COUPONS_EXPIRED = "优惠券已过期";

    /**
     * 返回参数错误
     * @return
     */
    public static final ApiResult resultParamsError() {
        ApiResult apiResult = ApiResultWapper.getVoidInstance();
        apiResult.setCode(ApiReturnConstant.OPERATION_STATUS_FAILUE);
        apiResult.setErrCode(ApiResultErrorCode.PARAMS_ERROR_101);
        apiResult.setMsg(ApiResultErrorCode.PARAMS_ERROR);
        return apiResult;
    }
}
