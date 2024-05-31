package com.IVdev.Arrayz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElemOfList {
    static List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8);

    public static void main(String[] args) {
        System.out.println(
                numbers.stream()
                        .max(Comparator.naturalOrder())
        );

//        int max = Integer.MIN_VALUE;
//        for (Integer number : numbers) {
//            if (number > max) {
//                max = number;
//            }
//        }
    }

//    void checkMaxElem() {
//        System.out.println(
//                numbers.stream()
//                        .max(Comparator.naturalOrder())
//        );
//    }
}
