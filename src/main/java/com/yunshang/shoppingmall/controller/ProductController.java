package com.yunshang.shoppingmall.controller;

import com.yunshang.shoppingmall.common.MessageConstants;
import com.yunshang.shoppingmall.common.Response;
import com.yunshang.shoppingmall.entity.Product;
import com.yunshang.shoppingmall.service.ProductService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 产品管理
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    //增加产品
    @ResponseBody
    @RequestMapping("/addProduct")
    public Response addProduct(HttpServletRequest request)throws Exception{
        //获取页面表单参数
        String productName=request.getParameter("productName");
        String repId=request.getParameter("repId");
        String productDesc=request.getParameter("proiductDesc");
        String productUnit=request.getParameter("productUnit");
        String supplier=request.getParameter("supplier");//供货商
        int repIds=Integer.valueOf(repId);

        //创建产品对象
        Product product=new Product();
        product.setProductName(productName);
        product.setProductDesc(productDesc);
        product.setProductUnit(productUnit);
        product.setSupplier(supplier);
        product.setRepId(repIds);

        //创建Map集合
        Map<String,Object> map=new HashMap<>();

        //调用保存方法插入数据
        int rows=  productService.insert(product);
        map.put("rows",rows);
        return new Response(MessageConstants.MSG_SUCCESS,map,"");
    }

    /**
     * 删除一个产品
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/delProduct")
    public Response delProductById(HttpServletRequest request)throws  Exception{
        //获取页面参数
        String productId=request.getParameter("productId");
         int productIds=Integer.valueOf(productId);

        //创建Map集合
        Map<String,Object> map=new HashMap<>();

         //调用删除方法
        int row=productService.deleteByPrimaryKey(productIds);
        map.put("rows",row);
        return new Response(MessageConstants.MSG_SUCCESS,map,"");
    }

    /**
     * 更新产品
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateProduct")
    public Response updateProduct(HttpServletRequest request)throws  Exception{

        //获取页面表单参数
        String productName=request.getParameter("productName");
        String repId=request.getParameter("repId");
        String productDesc=request.getParameter("proiductDesc");
        String productUnit=request.getParameter("productUnit");
        String supplier=request.getParameter("supplier");//供货商

        //创建Map集合
        Map<String,Object> map=new HashMap<>();

        //创建产品对象
        Product product=new Product();
        product.setProductName(productName);
        product.setProductDesc(productDesc);
        product.setProductUnit(productUnit);
        product.setSupplier(supplier);

        //调用更新方法
        int rows=productService.updateByPrimaryKeySelective(product);

        map.put("rows",rows);

        return new Response(MessageConstants.MSG_SUCCESS,map,"");
    }

    /**
     * 根据产品名称查询产品
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectProductByProductName")
    public Response selectProductByProductName(HttpServletRequest request)throws Exception{
        //获取页面参数
        String productName=request.getParameter("");

        List<Product> productList=new ArrayList<>();
        //调用查询方法
        productList=productService.selectProductByProductName(productName);

        //创建Map集合
        Map<String,Object> map=new HashMap<>();
        map.put("productList",productList);

        return  new Response(MessageConstants.MSG_SUCCESS,map,"");
    }


}
