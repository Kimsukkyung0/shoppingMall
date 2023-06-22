package com.example.shoppingmall.product;

import com.example.shoppingmall.product.model.*;
import com.example.shoppingmall.utils.FileUtils;
import com.example.shoppingmall.utils.FileUtils2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductMapper mapper;

    @Value("${file.dir}")
    private String filedir;

    @Autowired
    public ProductService(ProductMapper mapper){
        this.mapper = mapper;
    }

    public int insProduct(MultipartFile img, ProductInsDto dto){

        //랜덤한 파일명 만들기
//        FileUtils utils = new FileUtils();
//        String fileName = img.getOriginalFilename();
//        String ext = utils.getExt(fileName);
//        String rdName = utils.getRdUuidName();
//        String savedFileName = rdName+"."+ext;
        String randomFileNm = FileUtils2.makeRandomFileNm(img.getOriginalFilename());

        //db에 파일네임 저장
        dto.setMainPic(randomFileNm);

        //마지막 pk값을 받아오기 위해성
        ProductEntity entity = new ProductEntity();
        entity.setNm(dto.getNm());
        entity.setCtnt(dto.getCtnt());
        entity.setBrand(dto.getBrand());
        entity.setPrice(dto.getPrice());
        entity.setMainPic(dto.getMainPic());

        int result = mapper.insProduct(entity);
        //path, 디렉토리명 만들기
        String dirPath = String.format("%s/product/%s",filedir,entity.getIproduct());


        File file = new File(dirPath);

        if(!(file.exists())){
            file.mkdirs();
        }
        String targetPath = String.format("%s/%s",dirPath,randomFileNm);
        File target = new File(targetPath);

        try{
            img.transferTo(target);
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
      return 1;
    }

    public int insProductPics(Long iproduct, List<MultipartFile> pics){
        ProductInsPicsDto dto = new ProductInsPicsDto();

        for (int i = 0; i < pics.size() ; i++) {

            String randomFileNm = FileUtils2.makeRandomFileNm(pics.get(i).getOriginalFilename());

            //db에 저장할json

            dto.setIproduct(iproduct);
            dto.setPic(randomFileNm);
            mapper.insProductPics(dto);


            //path, 디렉토리명 만들기
            String dirPath = String.format("%s/product/%s/pics",filedir,iproduct);


            File file = new File(dirPath);

            if(!(file.exists())){
                file.mkdirs();
            }
            String targetPath = String.format("%s/%s",dirPath,randomFileNm);
            File target = new File(targetPath);

            try{
                pics.get(i).transferTo(target);

            }catch(IOException e){
                e.printStackTrace();
                return 0;}

            }
        return 1;
        }

    List<ProductVo> getProductList(){
        return mapper.getProductList();
    }

    ProductDetailRes getProductDetail(ProductEntity entity){
        List<String> list = mapper.getProductPics(entity);
        ProductDetailVo vo = mapper.getProductDetail(entity);
        return ProductDetailRes.builder()
                .vo(vo)
                .pics(list)
                .build();
    }
    }

