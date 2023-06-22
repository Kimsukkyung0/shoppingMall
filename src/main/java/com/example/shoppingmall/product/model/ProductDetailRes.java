package com.example.shoppingmall.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class ProductDetailRes {
    private ProductDetailVo data;
    private List<String> pics;
}
