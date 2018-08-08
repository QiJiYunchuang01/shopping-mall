package com.yunshang.shoppingmall.mapper;

import com.yunshang.shoppingmall.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台管理员接口类
 */
@Mapper
public interface AdminMapper {

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}