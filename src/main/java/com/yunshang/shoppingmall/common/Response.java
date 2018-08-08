package com.yunshang.shoppingmall.common;

import java.util.Map;

/**
 * 结果返回对象
 */
public class Response {
    private String msg;//信息
    private String msgCode;//信息状态码
    private Object data;//需要返回的数据对象
    private long count;//
    private String errorDetail;//错误信息


    public Response() {
    }

    public Response(Map<String, String> msgMap, Object data, long count, String errorDetail) {
        for (String key : msgMap.keySet()) {
            this.msgCode = key;
            this.msg = msgMap.get(key);
        }
        this.data = data;
        this.count=count;
        this.errorDetail = errorDetail;
    }
    public Response(Map<String, String> msgMap, Object data, String errorDetail) {
        for (String key : msgMap.keySet()) {
            this.msgCode = key;
            this.msg = msgMap.get(key);
        }
        this.data = data;
        this.errorDetail = errorDetail;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public long getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Response{" +
                "msg='" + msg + '\'' +
                ", msgCode='" + msgCode + '\'' +
                ", data=" + data +
                ", errorDetail='" + errorDetail + '\'' +
                '}';
    }
}
