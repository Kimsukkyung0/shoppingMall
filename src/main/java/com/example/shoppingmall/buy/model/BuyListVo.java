package com.example.shoppingmall.buy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BuyListVo {

    private long ibuy;
    private long iproduct;
    private String cName;
    private long icustomer;
    private String pName;
    private int quantity;
    private String buyAt;
    private long price;
    private String mainPic;
}
