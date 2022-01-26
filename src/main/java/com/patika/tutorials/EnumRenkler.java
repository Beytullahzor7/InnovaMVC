package com.patika.tutorials;

import lombok.Getter;
import lombok.Setter;


//type safe noktasında bizlere avantaj saglar
public enum EnumRenkler {
    MAVI, YESIL, TURUNCU
}

enum Renkler2 {
    MAVI(1,"mavi"),YESIL(2,"yesil"),TURUNCU(3,"turuncu");

    @Getter //Set işlemi olmasını istemediğimiz için final olarak tanımladık
    private final int renkId;

    @Getter
    private final String renkAdi;

    Renkler2(int renkId, String renkAdi) {
        this.renkId = renkId;
        this.renkAdi = renkAdi;
    }
}

class Deneme{
    public static void main(String[] args) {
        EnumRenkler renkler = EnumRenkler.TURUNCU;
        System.out.println(renkler);

        String renkler2 = EnumRenkler.TURUNCU.toString();
        System.out.println(renkler2.toLowerCase());
        System.out.println("-------------");

        String renkler3 = Renkler2.MAVI.getRenkAdi();
        System.out.println(renkler3);
    }
}
