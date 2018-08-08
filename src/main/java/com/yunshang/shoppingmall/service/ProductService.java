package com.yunshang.shoppingmall.service;

import com.yunshang.shoppingmall.entity.Product;

/**
 * 产品Service
 */
public interface ProductService {

    int deleteByPrimaryKey(Integer productId);

    /**
     * 增加商品
     * @param product
     * @return
     */
    int insert(Product product);


    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}
