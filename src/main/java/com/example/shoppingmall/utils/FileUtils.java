package com.example.shoppingmall.utils;

import java.util.UUID;

public class FileUtils {
    //get ext
    //get original name
    // get rd name
    public static String getExt(String file){
        return file.substring(file.lastIndexOf(".")+1);
    }

    public static String getOriginalFileName(String file){
        return file.substring(0,file.lastIndexOf(".")+1);
    }

    public static String getRdUuidName(String file){
        return UUID.randomUUID().toString();
    }

}
