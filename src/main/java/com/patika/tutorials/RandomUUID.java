package com.patika.tutorials;

import java.util.UUID;

public class RandomUUID {

    public static void main(String[] args) {
        //32 karakterli şifreleme
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

    }
}
