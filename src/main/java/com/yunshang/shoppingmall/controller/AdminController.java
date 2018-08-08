package com.yunshang.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理员Admin
 */
@Controller
public class AdminController {

    //跳转管理列表页面
    @RequestMapping("/getAdminList")
    public String getAdminList(){
        return "adminList";
    }

}
