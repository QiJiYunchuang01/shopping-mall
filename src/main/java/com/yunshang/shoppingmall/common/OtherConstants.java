package com.yunshang.shoppingmall.common;

/**
 * Created by Shiyuan on 2017/5/11.
 */
public class OtherConstants {

    /**
     * 日志sessionId标识
     */
    public final static String LOG_SESSION_KEY = "sessionId";
    /**
     * 后台登录标示
     */
    public final static String LOG_SESSION_Admin_Login_Key = "admin";

    /**
     * 前端标示key
     */
    public final static String LOG_SESSION_Pc_Login_Key = "keyId";
    /**
     * 前端标示val
     */
    public final static String LOG_SESSION_Pc_Login_Val = "mall";

    /**
     * 手机号正则表达式
     */
    public static final String PHONE_REGEXP = "^(13[0-9]|14[579]|15[0-3,5-9]|17[0135678]|18[0-9])\\d{8}$";

    /**
     * 身份证正则表达式
     */
    public static final String ID_NO_REGEXP = "^(^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$)|(^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])((\\d{4})|\\d{3}[Xx])$)$";

}
