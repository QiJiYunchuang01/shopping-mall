package com.yunshang.shoppingmall.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 消息返回码常量类
 */
public class MessageConstants {
    public static final Map<String, String> MSG_SUCCESS = new HashMap<String, String>() {{
        put("000000", "操作成功");
    }};
    public static final Map<String, String> MSG_SYS_ERROR = new HashMap<String, String>() {{
        put("999999", "系统错误");
    }};
    public static final Map<String, String> MSG_ILLEGAL_ARGUMENT = new HashMap<String, String>() {{
        put("999001", "参数有误");
    }};
    public static final Map<String, String> MSG_ITEM_EXISTS = new HashMap<String, String>() {{
        put("999002", "对象已存在");
    }};
    public static final Map<String, String> MSG_ITEM_NOT_EXIST = new HashMap<String, String>() {{
        put("999003", "对象不存在");
    }};
    public static final Map<String, String> MSG_UNUSABLE_STAT = new HashMap<String, String>() {{
        put("999004", "状态错误");
    }};
    public static final Map<String, String> MSG_NO_LOGIN = new HashMap<String, String>() {{
        put("999005", "未登录");
    }};
    public static final Map<String, String> MSG_ACCESS_DENY = new HashMap<String, String>() {{
        put("999006", "访问拒绝");
    }};
    public static final Map<String, String> MSG_INVALID_LOGIN = new HashMap<String, String>() {{
        put("999007", "无效登录");
    }};
    public static final Map<String, String> MSG_VALID_LOGIN = new HashMap<String, String>() {{
        put("999008", "登录有效");
    }};
    public static final Map<String, String> MSG_REMOTE_ACCESS_ERROR = new HashMap<String, String>() {{
        put("999009", "远程访问错误");
    }};
    public static final Map<String, String> MSG_REMOTE_ACCESS_FAILED = new HashMap<String, String>() {{
        put("999010", "远程访问失败");
    }};
    public static final Map<String, String> MSG_OPERATE_FAILED = new HashMap<String, String>() {{
        put("999013", "操作异常");
    }};

    public static final Map<String, String> MSG_CUSTOM(String key, String val) {
        return new HashMap<String, String>() {{
            put(key, val);
        }};
    }

    public static final Map<String, String> MSG_CUSTOM(String val) {
        return new HashMap<String, String>() {{
            put("999015", val);
        }};
    }


    public static final Map<String, String> MSG_VERIFY_OVERTIME = new HashMap<String, String>() {{
        put("666001", "验证码过期！");
    }};
    public static final Map<String, String> MSG_VERIFY_ERROR = new HashMap<String, String>() {{
        put("666002", "验证码错误！");
    }};
    public static final Map<String, String> MSG_VERIFY_SEND_FAILED = new HashMap<String, String>() {{
        put("666003", "信息发送失败！");
    }};
    public static final Map<String, String> MSG_VERIFY_PHONE_ERROR= new HashMap<String, String>() {{
        put("666004", "手机号错误！");
    }};
    public static final Map<String, String> MSG_VERIFY_SEND_WAITING= new HashMap<String, String>() {{
        put("666005", "请稍后重试！");
    }};
    public static final Map<String, String> MSG_NAMEORPWD_ERROR = new HashMap<String, String>() {{
        put("666006", "用户名或密码错误！");
    }};
    public static final Map<String, String> MSG_NUMBER_FORMAT_ERROR = new HashMap<String, String>() {{
        put("666007", "数字参数有误！");
    }};
    public static final Map<String, String> MSG_MONEY_NOT_ENOUGH= new HashMap<String, String>() {{
        put("666008", "数量不够！");
    }};
    public static final Map<String, String> MSG_USER_INEXISTENCE= new HashMap<String, String>() {{
        put("666009", "用户不存在！");
    }};

}
