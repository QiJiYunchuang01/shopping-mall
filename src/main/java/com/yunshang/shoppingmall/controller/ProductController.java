package com.yunshang.shoppingmall.controller;

import com.yunshang.shoppingmall.common.Response;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 产品管理
 */
@Controller
public class ProductController {

    //增加产品
    @ResponseBody
    @RequestMapping("/addProduct")
    public Response addProduct(HttpServletRequest request)throws Exception{
        request.getParameter("");

        return new Response();
    }



}
