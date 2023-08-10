package com.IVdev.Arrayz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintOddNumbers {
    public static void main(String[] args) {
        int arr[] = {2,5,5,5,8,4,5,6,8,5,3,4,9};
        System.out.println(printOddNums(arr));
    }

    //решение на стримах является всегда лаконичным зачастую
    //получили стрим интов, i & 1 дает в фильтре только нечетные числа
    public static int printOddNums(int[] arr) {
        System.out.println(IntStream.of(arr)
                .filter(i -> (i & 1) == 1)
                .mapToObj(Integer::toString)
                .distinct()
                .collect(Collectors.joining(", ")));
        return 0;
    }
}
