package com.patika.tutorials;

public class TernaryString {
    public static void main(String[] args) {
        int sayi = 6;
        String ternary = (sayi==5) ? "sayı 5"  : "5 değil" ;
        System.out.println(ternary);

        String a = "a";
        int b = (a=="a") ? 1 : 0;
        System.out.println(b);
    }

}
