package com.example.shoppingmall.product.model;

import lombok.Data;

import java.util.List;

@Data
public class ProductEntity {
    private long iproduct;
    private Integer price;
    private String ctnt;
    private String nm;
    private String mainPic;
    private String brand;
    private String createdAt;
}
