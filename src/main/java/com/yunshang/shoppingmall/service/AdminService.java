package com.yunshang.shoppingmall.service;

import com.yunshang.shoppingmall.entity.Admin;

/**
 * admin后台管理员接口
 */
public interface AdminService {

    //根据adminId删除管理员
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    //增加管理员
    int insertSelective(Admin admin);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin admin);

    int updateByPrimaryKey(Admin record);

    //根据用户名查询
    Admin selectAdminByUserName(String username);

}
