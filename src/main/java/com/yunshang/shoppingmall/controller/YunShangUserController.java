package com.yunshang.shoppingmall.controller;

import com.yunshang.shoppingmall.entity.YunShangUser;
import com.yunshang.shoppingmall.service.YunShangUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

@Controller
public class YunShangUserController {
    @Autowired
    YunShangUserService yunShangUserService;
    @ResponseBody
    @RequestMapping(value = "/queryUser")
    public Map<String,Object> queryUser(){

        Map<String,Object> map=new HashMap<>();

        YunShangUser user= yunShangUserService.selectByPrimaryKey(1);
        map.put("user",user);
        System.out.println("----->"+user.getUserName());
        return map;
    }
}
