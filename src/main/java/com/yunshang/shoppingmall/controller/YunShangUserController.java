package com.yunshang.shoppingmall.controller;

import com.yunshang.shoppingmall.entity.YunShangUser;
import com.yunshang.shoppingmall.service.YunShangUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 后台系统登录
     * @param request
     * @return
     */
   @RequestMapping(value="/sysLogin",method = RequestMethod.POST)
   public String sysLogin(HttpServletRequest request){
       String username = request.getParameter("username");
       String pwd=request.getParameter("pwd");

        YunShangUser user=yunShangUserService.selectUserByUserName(username);
        if(username.equals(user.getUserName())&&pwd.equals(user.getPwd())){
            System.out.println("------》"+username);
            return "index";
        }else{
            return "login";
        }


   }

}
