package com.yunshang.shoppingmall.mapper;

import com.yunshang.shoppingmall.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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