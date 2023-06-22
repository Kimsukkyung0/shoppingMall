package com.example.shoppingmall.product;

import com.example.shoppingmall.product.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    int insProduct(ProductEntity entity);
    int insProductPics(ProductInsPicsDto dto);
    List<ProductVo> getProductList();
    ProductDetailVo getProductDetail(ProductEntity entity);
    List<String> getProductPics(ProductEntity entity);
}
