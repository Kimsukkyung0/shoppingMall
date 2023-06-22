package com.example.shoppingmall.customer;

import com.example.shoppingmall.customer.Model.CustomerGetVo;
import com.example.shoppingmall.customer.Model.CustomerInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<CustomerGetVo>> getCustomer(){
        return ResponseEntity.ok(service.selCustomer());
    }
}
