package com.example.shoppingmall.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class ProductDetailRes {
    private ProductDetailVo vo;
    private List<String> pics;
}
