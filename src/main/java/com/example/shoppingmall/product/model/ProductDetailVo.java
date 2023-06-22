package com.example.shoppingmall.product.model;



import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ProductDetailVo {
    private Long iproduct;
    private int price;
    private String nm;
    private String ctnt;
    private String mainPic;
    private String brand;
}
