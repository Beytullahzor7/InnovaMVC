package com.patika.designpattern.creation.a2.builder;


import lombok.Builder;

@Builder
public class BuilderTuto {

    private String name;
    private String surName;

    public static void main(String[] args) {
        BuilderTuto b1 = BuilderTuto.builder()
                .name("Beytullah")
                .surName("Zor")
                .build();

        System.out.println(b1.toString());
    }
}
