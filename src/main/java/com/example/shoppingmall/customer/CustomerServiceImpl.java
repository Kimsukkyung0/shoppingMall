package com.example.shoppingmall.customer;


import com.example.shoppingmall.customer.Model.CustomerGetVo;
import com.example.shoppingmall.customer.Model.CustomerInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService{
    private final CustomerMapper mapper;

    @Autowired
    public CustomerServiceImpl(CustomerMapper mapper){
        this.mapper = mapper;
    }
    @Override
    public int insCustomer(CustomerInsDto dto){
        return mapper.insCustomer(dto);
    }
    @Override
    public List<CustomerGetVo> selCustomer(){return mapper.selCustomer();}
}
