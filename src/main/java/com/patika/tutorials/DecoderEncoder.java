package com.patika.tutorials;

import java.util.Base64;
import java.util.Scanner;

public class DecoderEncoder {
    public static void main(String[] args) {
        DecoderEncoder decoderEncoder = new DecoderEncoder();

        String input = decoderEncoder.getScannerMethod();
        System.out.println(decoderEncoder.getEncoderMethod(input));

        //decoderEncoder.getDecoderMethod(decoderEncoder.getEncoderMethod(decoderEncoder.getScannerMethod()));

    }

    public String getScannerMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sifrelenecek kelimeyi giriniz: ");
        return input.next();
    }

    //Encoder = Sifreleme
    public String getEncoderMethod(String data){
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    public void getDecoderMethod(String data){
        String sifreCoz = new String(Base64.getMimeDecoder().decode(data));
        System.out.println(sifreCoz);
    }
}
