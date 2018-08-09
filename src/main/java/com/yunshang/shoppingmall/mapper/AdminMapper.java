package com.yunshang.shoppingmall.mapper;

import com.yunshang.shoppingmall.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台管理员接口类
 */
@Mapper
public interface AdminMapper {
    //根据ID删除
    int deleteByPrimaryKey(Integer adminId);


    int insert(Admin admin);

    //增加
    int insertSelective(Admin admin);

    //
    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}