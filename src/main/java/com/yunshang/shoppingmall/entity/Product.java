package com.yunshang.shoppingmall.entity;

import java.io.Serializable;

/**
 * 产品实体类
 */
public class Product  implements Serializable {
    private Integer productId;

    private String productName;

    private Integer repId;

    private String productDesc;

    private String productUnit;

    private String supplier;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getRepId() {
        return repId;
    }

    public void setRepId(Integer repId) {
        this.repId = repId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", repId=" + repId +
                ", productDesc='" + productDesc + '\'' +
                ", productUnit='" + productUnit + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}