package com.yunshang.shoppingmall.service;

import com.yunshang.shoppingmall.entity.Product;

import java.util.List;

/**
 * 产品Service
 */
public interface ProductService {
    /**
     * 根据产品ID删除产品
     * @param productId
     * @return
     */
    int deleteByPrimaryKey(Integer productId);

    /**
     * 增加商品
     * @param product
     * @return
     */
    int insert(Product product);


    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    /**
     * 更新产品
     * @param product
     * @return
     */
    int updateByPrimaryKeySelective(Product product);


    int updateByPrimaryKey(Product record);

    /**
     * 根据产品名称查询产品
     * @param productName
     * @return
     */
    List<Product> selectProductByProductName(String productName);
}
