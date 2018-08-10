package com.yunshang.shoppingmall.service.impl;

import com.yunshang.shoppingmall.entity.Admin;
import com.yunshang.shoppingmall.mapper.AdminMapper;
import com.yunshang.shoppingmall.service.AdminService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * adminService后台管理员接口实现类
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

//根据adminId删除管理员
    @Override
    public int deleteByPrimaryKey(Integer adminId) {
        return adminMapper.deleteByPrimaryKey(adminId);
    }

    @Override
    public int insert(Admin record) {
        return 0;
    }

    //增加管理员
    @Override
    public int insertSelective(Admin admin) {
        return adminMapper.insertSelective(admin);
    }

    @Override
    public Admin selectByPrimaryKey(Integer adminId) {
        return null;
    }

    //更新管理员
    @Override
    public int updateByPrimaryKeySelective(Admin admin) {

        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }

    @Override
    public Admin selectAdminByUserName(String username) {
        return adminMapper.selectAdminByUserName(username);
    }
}
