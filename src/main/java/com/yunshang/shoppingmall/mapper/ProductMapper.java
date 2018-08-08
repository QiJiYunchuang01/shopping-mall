package com.yunshang.shoppingmall.mapper;

import com.yunshang.shoppingmall.entity.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品类mapper
 */
@Mapper
public interface ProductMapper {
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