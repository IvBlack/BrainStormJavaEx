package com.IVdev.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
solution allows you to convert the strings in the array
to their lengths and sums, if desired
**/
public class ConvertLengthToInt {

    //input list
    static List<String> strings = Arrays.asList("apple", "banana", "cherry");
    public static void main(String[] args) {
//        List<Integer> lengths = new ArrayList<>();
//        for (String str : strings) {
//            lengths.add(str.length());
//        }
        toLength();
    }

    public static void toLength() {
        System.out.println(
                Arrays.toString(strings.stream()
                        .filter(Objects::nonNull)
                        .mapToInt(String::length)
//                        .reduce(0,Integer::sum)
                        .toArray())
            );
    }
}
