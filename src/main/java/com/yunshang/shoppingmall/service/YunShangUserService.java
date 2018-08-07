package com.yunshang.shoppingmall.service;

import com.yunshang.shoppingmall.entity.YunShangUser;

public interface YunShangUserService {
    int deleteByPrimaryKey(Integer userId);

    int insert(YunShangUser record);

    int insertSelective(YunShangUser record);

    YunShangUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(YunShangUser record);

    int updateByPrimaryKey(YunShangUser record);

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    YunShangUser selectUserByUserName(String username);

}
