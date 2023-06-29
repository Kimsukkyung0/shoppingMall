package com.example.shoppingmall.buy;

import com.example.shoppingmall.buy.model.BuyInsDto;
import com.example.shoppingmall.buy.model.BuyListDto;
import com.example.shoppingmall.buy.model.BuyListVo;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyMapper {
    int insBuyRecord(BuyInsDto dto);
    List<BuyListVo> getBuyRecords(BuyListDto dto);
}
