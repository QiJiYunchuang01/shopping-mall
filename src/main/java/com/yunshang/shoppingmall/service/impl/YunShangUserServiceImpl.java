package com.yunshang.shoppingmall.service.impl;

import com.yunshang.shoppingmall.entity.YunShangUser;
import com.yunshang.shoppingmall.mapper.YunShangUserMapper;
import com.yunshang.shoppingmall.service.YunShangUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("yunShangUserService")
public class YunShangUserServiceImpl implements YunShangUserService {

    @Autowired
    YunShangUserMapper yunShangUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    /**
     * 保存一个用户
     * @param record
     * @return
     */
    @Override
    public int insert(YunShangUser record) {
        return yunShangUserMapper.insert(record);
    }

    @Override
    public int insertSelective(YunShangUser record) {
        return 0;
    }

    /**
     * 根据用户ID查询一个用户
     * @param userId
     * @return
     */
    @Override
    public YunShangUser selectByPrimaryKey(Integer userId) {
        return yunShangUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(YunShangUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(YunShangUser record) {
        return 0;
    }

}
