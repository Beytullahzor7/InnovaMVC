package com.patika.tutorials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@Builder
@Log4j2
public class Log4j2Tutorials {

    private String ad;
    private String soyad;
    private String numara;

    public Log4j2Tutorials(){
        this.ad = "adınızı girmediniz";
        this.soyad = "soyadınızı girmediniz";
        this.numara = "numaranızı girmediniz";
    }

    public static void main(String[] args) {
        Log4j2Tutorials tutorials = new Log4j2Tutorials();
        System.out.println(tutorials);

        if (tutorials.getAd().equals("adınızı girmediniz")){
            log.error("Hata adınızı girmediniz");
        }else{
            log.info("Bilgiler Girildi");
        }
    }
}
