package com.example.shoppingmall.customer;

import com.example.shoppingmall.customer.Model.CustomerInsDto;
import org.springframework.stereotype.Service;


public interface CustomerService {
    int insCustomer(CustomerInsDto dto);
}
