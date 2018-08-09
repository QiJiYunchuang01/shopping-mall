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


    @Override
    public int deleteByPrimaryKey(Integer adminId) {
        return 0;
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

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }
}
