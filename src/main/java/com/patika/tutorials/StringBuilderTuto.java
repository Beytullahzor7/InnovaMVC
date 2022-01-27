package com.patika.tutorials;

public class StringBuilderTuto {
    public static void main(String[] args) {
        //1. YOL
        String ad = "Beytullah";
        String soyad = " Zor";
        System.out.println(ad + soyad);


        //2. YOL
        String result = "Beytullah".concat(" Zor");
        System.out.println(result);

        //3. YOL //Service,Database karşı taraftan ne geleceğini bilmiyorsam kullanırım
        //Asenkron: aynı anda birden fazla iş yapabilme yetenegi
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Beytullah").append(" ").append("Zor");
        String result2 = stringBuilder.toString();
        System.out.println(result2);

        //4. YOL güvenli
        //Senkron: aynı anda birden fazla iş yapabilme yetenegi
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Beytullah").append(" ").append("Zor");
        String result3 = stringBuffer.toString();
        System.out.println(result3);


    }
}
