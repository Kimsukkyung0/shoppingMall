package com.example.shoppingmall.customer;

import com.example.shoppingmall.customer.Model.CustomerGetVo;
import com.example.shoppingmall.customer.Model.CustomerInsDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {
    int insCustomer(CustomerInsDto dto);
    List<CustomerGetVo> selCustomer();
}
