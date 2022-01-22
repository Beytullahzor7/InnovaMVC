package com.patika.software;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MonadTutorials {

    //First Method
    public static String getValue(String data){
        return data;
    }

    //Second Method
    public static String getResult(String data){
        return data.toUpperCase();
    }

    public static void main(String[] args) {
        String monad = getResult(getValue("Samsun"));
        log.info(monad);
    }
}
