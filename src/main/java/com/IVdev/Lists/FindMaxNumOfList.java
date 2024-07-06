package com.IVdev.Lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxNumOfList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8);

        //rewrite this to functional
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        //-----------------in stream concept-------------------------
        Optional<Integer> mx = numbers.stream()
                .reduce(Integer::max);
        System.out.println(mx);

        Optional<Integer> mx2 = numbers.stream()
                .max(Comparator.naturalOrder());
        System.out.println(mx2);

        System.out.println(
                numbers.stream()
                        .collect(Collectors.summarizingInt(Integer::intValue))
                        .getMax()
        );
    }
}
