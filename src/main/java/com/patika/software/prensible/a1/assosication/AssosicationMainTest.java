package com.patika.software.prensible.a1.assosication;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AssosicationMainTest {
    public static void main(String[] args) {
        Musteri musteri=Musteri.builder()
                .musteriAdi("Beytullah")
                .musteriSehir("Samsun")
                .build();

        SuperMarket superMarket=SuperMarket.builder()
                .superMarketAdi("ABC")
                .superMarketSehir("Samsun")
                .build();

        //loose Coupling (Zayıf bağlantı türüne ==> Association diyoruz)
        log.info("Müşteri adı " + musteri.getMusteriAdi() + " Süpermarket adi: " + superMarket.getSuperMarketAdi());
    }
}