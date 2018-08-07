package com.yunshang.shoppingmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
//@MapperScan("com.yunshang.shoppingmall.mapper.*.xml")
@MapperScan(basePackages = {"com.yunshang.shoppingmall.mapper"})
public class ShoppingMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallApplication.class, args);
    }
}
