package com.pp.shopping.module.sys.common.api;

import java.io.Serializable;

/**
 * @Description:
 * @Author: panpeng
 * @Date: 2018/5/22
 */
public class ApiResult  implements Serializable {

    private Boolean isVoid;

    private Object data;

    //默认成功
    private Integer code = ApiReturnConstant.OPERATION_STATUS_SUCCESS;;

    private String msg;

    private Integer errCode;

    public ApiResult() {
    }

    public ApiResult(Object data) {
        this.isVoid = false;
        this.data = data;
    }

    public ApiResult(Boolean isVoid) {
        this.isVoid = isVoid;
    }

    public Boolean getVoid() {
        return isVoid;
    }

    public void setVoid(Boolean aVoid) {
        isVoid = aVoid;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public boolean isSuccess(){
        return this.code.intValue() == ApiReturnConstant.OPERATION_STATUS_SUCCESS;
    }
}
