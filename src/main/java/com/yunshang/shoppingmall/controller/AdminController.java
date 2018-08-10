package com.yunshang.shoppingmall.controller;

import com.yunshang.shoppingmall.entity.Admin;

import com.yunshang.shoppingmall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


/**
 * 后台管理员Admin
 */
@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    //管理员后台登录页面
    @RequestMapping("/getAdminLogin")
    public String getLogin(){

        return "login";
    }


    //管理员登录
    @RequestMapping(value="/loginAdmin",method = RequestMethod.POST)
    public String loginAdmin(String username,String pwd){

        //查询
        if("".equals(username)){
            System.out.println("用户名为空！");
        }else{
           Admin admin= adminService.selectAdminByUserName(username);
         if(username.equals(admin.getAdminName())&&pwd.equals(admin.getPwd())){
             return "index";
         }

        }
        return "login";

    }


    //跳转管理列表页面
    @RequestMapping("/getAdminList")
    public String getAdminList(Model map){
        List<Admin> adminList=new ArrayList<>();
        Admin admin=new Admin();
        admin.setAdminId(12);
        admin.setAdminName("wenjie");
        admin.setPwd("1234");
        admin.setRealName("文杰");
        admin.setLimited("一般管理员");

        adminList.add(admin);


        map.addAttribute("adminList",adminList);
        return "adminList";
    }

    //增加管理员
    @RequestMapping("/addAdmin")
    public String addAdmin(){
        return "addAdmin";
}

    @RequestMapping("/saveAdmin")
    public String saveAdmin(String username,String realname,String password,String limitBox1,String limitBox2){

        System.out.println("-----add");
        System.out.println("login---->"+username+"  "+password+"  "+limitBox1+" -- "+limitBox2);
        Admin admin =new Admin();
        admin.setAdminName(username);
        admin.setPwd(password);
        admin.setRealName(realname);
        if("on".equals(limitBox1)){
            admin.setLimited("一般管理员");
        }else{
            admin.setLimited("超级管理员");
        }

        //保存
        int rows= adminService.insertSelective(admin);

        return "adminList";
}

    //更新
    @RequestMapping("/editAdmin")
    public String updateAdmin( String adminId){
        System.out.println("------>"+adminId);
        int adminIds =Integer.valueOf(adminId);
        //根据adminId查询admin

        Admin admin=adminService.selectByPrimaryKey(adminIds);

        return "editAdmin";
   }

   //根据adminId删除管理员
    @RequestMapping("/delAdmin")
    public String delAdmin(String adminId){
       int adminIds =Integer.valueOf(adminId);
       int rows= adminService.deleteByPrimaryKey(adminIds);
        return "adminList";
    }




}
