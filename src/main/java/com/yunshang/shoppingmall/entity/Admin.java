package com.yunshang.shoppingmall.entity;

import java.io.Serializable;

/**
 * 后台管理员类
 */
public class Admin implements Serializable {
    private Integer adminId;

    private String adminName;

    private String pwd;

    private String realName;

    private String limited;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getLimited() {
        return limited;
    }

    public void setLimited(String limited) {
        this.limited = limited == null ? null : limited.trim();
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", realName='" + realName + '\'' +
                ", limited='" + limited + '\'' +
                '}';
    }
}