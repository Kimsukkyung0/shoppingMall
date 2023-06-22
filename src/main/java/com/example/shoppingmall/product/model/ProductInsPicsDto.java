package com.example.shoppingmall.product.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ProductInsPicsDto {
    private Long iproduct;
    private String pic;

}
