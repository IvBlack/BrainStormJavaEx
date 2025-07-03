package com.IVdev.streamex;

import java.util.List;
import java.util.stream.Stream;

public class StreamPitfalls {

    public static void main(String[] args) {
        alreadyUsed();
    }

    public static void alreadyUsed() {

        List<String> lst = List.of("Aaaa", "Bbbb");

        Stream<String> stream = lst.stream();
        stream.forEach(System.out::println);

//        уже использован
//        stream.forEach(System.out::println);
    }
}
