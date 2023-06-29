package com.example.shoppingmall.buy;

import com.example.shoppingmall.buy.model.BuyInsDto;
import com.example.shoppingmall.buy.model.BuyListDto;
import com.example.shoppingmall.buy.model.BuyListVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BuyService {
    private final BuyMapper mapper;

    public int insBuyRecord(BuyInsDto dto){
        return mapper.insBuyRecord(dto);
    };
    public List<BuyListVo> getBuyRecords(BuyListDto dto){
        return mapper.getBuyRecords(dto);
    }
}
