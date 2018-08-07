package com.yunshang.shoppingmall.mapper;

import com.yunshang.shoppingmall.entity.YunShangUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YunShangUserMapper {

    int deleteByPrimaryKey(Integer userId);

    int insert(YunShangUser record);

    int insertSelective(YunShangUser record);

    YunShangUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(YunShangUser record);

    int updateByPrimaryKey(YunShangUser record);


}