package com.patika.tutorials;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));

    }
    public static int factorial(int sayi){
        if (sayi == 1){
            return 1;
        }else{
            return sayi * factorial(sayi-1);
        }
    }
}
