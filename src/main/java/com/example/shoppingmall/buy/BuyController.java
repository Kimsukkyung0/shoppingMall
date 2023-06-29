package com.example.shoppingmall.buy;

import com.example.shoppingmall.buy.model.BuyInsDto;
import com.example.shoppingmall.buy.model.BuyListDto;
import com.example.shoppingmall.buy.model.BuyListVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/buy")
@RequiredArgsConstructor
public class BuyController {
    private final BuyService service;

    @PostMapping
    public int insBuyRecord(@RequestBody BuyInsDto dto){
        return service.insBuyRecord(dto);
    }

    @GetMapping("/{icustomer}")
    public List<BuyListVo> getBuyRecords(@PathVariable long icustomer){
        BuyListDto dto = new BuyListDto();
        dto.setIcustomer(icustomer);
        return service.getBuyRecords(dto);
    }

}
