package com.pp.shopping.module.sys.common.api;

/**
 * 接口返回常量值
 * @author:panpeng
 * @time:2018-5-24 14:09:44
 */
public class ApiReturnConstant {
	// 公用参数 成功
	public static String SUCCESS = "success";
	// 公用参数 失败
	public static String FAILURE = "failure";
	
	/**
	 * API返回数据
	 */
	public static String API_RESULT_DATA = "data";
	/**
	 * API返回的状态值，1-成功；0-失败
	 */
	public static String API_RESULT_STATUS = "status";
	/**
	 * API返回的错误码
	 */
	public static String API_RESULT_ERRCODE = "errCode";
	/**
	 * API返回的信息
	 */
	public static String API_RESULT_MESSAGE = "message";
	
	// 调用接口返回结果 成功
	public static int OPERATION_STATUS_SUCCESS = 0;
	// 调用接口返回结果 失败
	public static int OPERATION_STATUS_FAILUE = 1;
}
