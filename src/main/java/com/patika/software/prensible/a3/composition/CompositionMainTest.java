package com.patika.software.prensible.a3.composition;

import java.util.ArrayList;

public class CompositionMainTest {
    public static void main(String[] args) {

        Yazar yazar = new Yazar();
        yazar.setYazarAdi("Robert");
        yazar.setYazarSoyadi("Green");
        yazar.setKitapList(new ArrayList<>()); //null pointer exception

        System.out.println(yazar);

        Kitap kitap = new Kitap();
        kitap.setKitapAdi("Mastery");
        kitap.setKitapFiyati("60");
        kitap.setYazar(yazar);
        kitap.getYazar().getKitapList().add(kitap);

        Kitap kitap2 = new Kitap();
        kitap2.setKitapAdi("İktidar");
        kitap2.setKitapFiyati("55");
        kitap2.setYazar(yazar);
        kitap2.getYazar().getKitapList().add(kitap2);

        System.out.println(kitap);
        System.out.println(kitap2);

    }
}
