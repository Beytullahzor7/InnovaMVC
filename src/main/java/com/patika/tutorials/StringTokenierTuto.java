package com.patika.tutorials;

import java.util.StringTokenizer;

public class StringTokenierTuto {
    public static void main(String[] args) {
        String jsonObject = "Html5, Css, Js, React, Hibernate, SpringBoot#SpringMVC";

        //1.yol
        String[] result = jsonObject.split(",");
        for(String temp : result ){
            System.out.println(temp);
        }

        System.out.println("*******************");

        //2.YOL
        StringTokenizer stringTokenizer=new StringTokenizer(jsonObject,",# ");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
        System.out.println("*******************");

        StringTokenizer token = new StringTokenizer(jsonObject,"#");
        while (token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
    }

}
