package com.example.shoppingmall.customer;

import com.example.shoppingmall.customer.Model.CustomerGetVo;
import com.example.shoppingmall.customer.Model.CustomerInsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    int insCustomer(CustomerInsDto dto);
    List<CustomerGetVo> selCustomer();
}
