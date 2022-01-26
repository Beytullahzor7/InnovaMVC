package com.patika.software.prensible.a3.composition;

import java.util.List;

public class Yazar {
    private String yazarAdi;
    private String yazarSoyadi;

    //composition
    private List<Kitap> kitapList;

    public Yazar(){}

    public Yazar(String yazarAdi, String yazarSoyadi) {
        this.yazarAdi = yazarAdi;
        this.yazarSoyadi = yazarSoyadi;
    }

    @Override
    public String toString() {
        return "Yazar{" +
                "yazarAdi='" + yazarAdi + '\'' +
                ", yazarSoyadi='" + yazarSoyadi + '\'' +
                '}';
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getYazarSoyadi() {
        return yazarSoyadi;
    }

    public void setYazarSoyadi(String yazarSoyadi) {
        this.yazarSoyadi = yazarSoyadi;
    }

    public List<Kitap> getKitapList() {
        return kitapList;
    }

    public void setKitapList(List<Kitap> kitapList) {
        this.kitapList = kitapList;
    }
}
