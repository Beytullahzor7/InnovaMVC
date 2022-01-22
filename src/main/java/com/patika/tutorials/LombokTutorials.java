package com.patika.tutorials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter+setter+toString+hashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LombokTutorials {

    private String adi;
    private String soyadi;
    private String numarasi;

    public static void main(String[] args) {
        LombokTutorials lombokTutorials = LombokTutorials
                .builder()
                .adi("Beytullah")
                .soyadi("Zor")
                .numarasi("123")
                .build();

        System.out.println(lombokTutorials);
    }
}
