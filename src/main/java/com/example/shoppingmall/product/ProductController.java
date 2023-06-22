package com.example.shoppingmall.product;

import com.example.shoppingmall.product.model.*;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public int InsProduct(@RequestPart MultipartFile img, @RequestPart ProductInsDto dto) {
        return service.insProduct(img,dto);
    }
//
//
//    @PostMapping(value="/file", consumes = {MediaType.APPLICATION_JSON_VALUE ,MediaType.MULTIPART_FORM_DATA_VALUE})
//    public int InsSong(@RequestPart SongInsDto data, @RequestPart MultipartFile file){
//        return 0;
//   }

    @PostMapping(value = "/{iproduct}", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public int insProductPics(@PathVariable Long iproduct, @RequestPart List<MultipartFile> pics){
        return service.insProductPics(iproduct,pics);
    }

    @GetMapping
    public List<ProductVo> getProductList(){
        return service.getProductList();
    }

    @GetMapping("/{iproduct}")
    public ProductDetailRes getProductDetail(@PathVariable long iproduct){
        ProductEntity entity = new ProductEntity();
        entity.setIproduct(iproduct);
        return service.getProductDetail(entity);
    }
}





