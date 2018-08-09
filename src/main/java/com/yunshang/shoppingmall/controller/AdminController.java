package com.yunshang.shoppingmall.controller;

import com.yunshang.shoppingmall.entity.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


/**
 * 后台管理员Admin
 */
@Controller
public class AdminController {

    //跳转管理列表页面
    @RequestMapping("/getAdminList")
    public String getAdminList(Model map){
        List<Admin> adminList=new ArrayList<>();


        Admin admin=new Admin();
        admin.setAdminId(12);
        admin.setAdminName("wenjie");
        admin.setPwd("1234");
        adminList.add(admin);

        map.addAttribute("adminList",adminList);
        return "adminList";
    }

    //增加管理员
    @RequestMapping("/addAdmin")
    public String addAdmin(){
        System.out.println("-----add");


        return "addAdmin";
}

}
