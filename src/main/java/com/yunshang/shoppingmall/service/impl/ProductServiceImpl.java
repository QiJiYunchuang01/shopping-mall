package com.yunshang.shoppingmall.service.impl;

import com.yunshang.shoppingmall.entity.Product;
import com.yunshang.shoppingmall.mapper.ProductMapper;
import com.yunshang.shoppingmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;


    @Override
    public int deleteByPrimaryKey(Integer productId) {
        return 0;
    }

    /**
     * 增加产品
     * @param product
     * @return
     */
    @Override
    public int insert(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public int insertSelective(Product record) {
        return 0;
    }

    @Override
    public Product selectByPrimaryKey(Integer productId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        return 0;
    }
}
