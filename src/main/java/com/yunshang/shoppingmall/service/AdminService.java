package com.yunshang.shoppingmall.service;

import com.yunshang.shoppingmall.entity.Admin;

/**
 * admin后台管理员接口
 */
public interface AdminService {

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
