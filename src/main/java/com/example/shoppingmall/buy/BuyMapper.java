package com.example.shoppingmall.buy;

import com.example.shoppingmall.buy.model.BuyInsDto;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuyMapper {
    int insBuyRecord(BuyInsDto dto);
}
