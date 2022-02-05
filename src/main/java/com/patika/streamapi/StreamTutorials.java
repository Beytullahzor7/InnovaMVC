package com.patika.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTutorials {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Samsun");
        list.add("Ankara");
        list.add("Bursa");
        list.add("Izmir");

        List<String> list2= list.stream().sorted().collect(Collectors.toList()); //Sorted = harf sırası
        list2.forEach(System.out::println);

        System.out.println("*****************");

        list.stream().filter(patika -> !"Samsun".equals(patika)).forEach(System.out::println);

        System.out.println("*****************");

        List<String> list3 = Arrays.asList("Ankara","Amasya","Samsun");
        list3.forEach(System.out::println);

    }
}
