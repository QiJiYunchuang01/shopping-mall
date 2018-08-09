package com.yunshang.shoppingmall.service;

import com.yunshang.shoppingmall.entity.Admin;

/**
 * admin后台管理员接口
 */
public interface AdminService {

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    //增加管理员
    int insertSelective(Admin admin);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
