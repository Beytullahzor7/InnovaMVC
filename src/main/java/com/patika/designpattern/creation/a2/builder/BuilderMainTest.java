package com.patika.designpattern.creation.a2.builder;

public class BuilderMainTest {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder.Builder().adi("Beytullah").soyadi("Zor").build();
        System.out.println(studentBuilder.getAdi()+ " " +studentBuilder.getSoyadi());
    }
}
