package com.example.shoppingmall.customer;

import com.example.shoppingmall.customer.Model.CustomerInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* 고객 회원가입 (post)
* */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService service;

    @Autowired
    public CustomerController(CustomerService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Integer> postCustomer(@RequestBody CustomerInsDto dto){
        int result = service.insCustomer(dto);
        return ResponseEntity.ok(result);
    }
}
