package com.example.shoppingmall.customer;

import com.example.shoppingmall.customer.Model.CustomerInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
    int insCustomer(CustomerInsDto dto);
}
