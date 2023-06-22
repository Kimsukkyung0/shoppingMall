package com.example.shoppingmall.buy;

import com.example.shoppingmall.buy.model.BuyInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BuyService {
    private final BuyMapper mapper;

    public int insBuyRecord(BuyInsDto dto){
        return mapper.insBuyRecord(dto);
    };
}
