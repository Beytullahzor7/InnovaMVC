package com.patika.software.prensible.a2.aggregation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Araba {

    private Motor motor;

    public double getToplamFiyat(){
        motor = new Motor();
        double toplam = motor.getMotorFiyati() + 2000;

        return toplam;
    }
}
