package com.IVdev.Arrayz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Find even, odd array/collection elements. Remove duplicates.
And display it on the screen.
*/
public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        //для демонстрации List -> int[]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 54, 87, 16, 43, 4, 1);
        int[] array = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) array[i] = numbers.get(i);

        mutateNums(array);
        deleteEven();
    }

    //решение объединяет поиск, сортировку, дублей в масиве/коллекции
    public static void mutateNums(int[] array) {
        System.out.println
            (
                IntStream.of(array)
                    .filter(i -> (i & 1) == 1) //либо нечетные
//                .filter(i -> (i & 1) == 0) //либо четные элементы
                    .mapToObj(Integer::toString)
                    .distinct()
                    .sorted()
                    .collect(Collectors.joining("... "))
            );
    }


    // удалить из листа все чётные элементы
    public static void deleteEven() {
        ArrayList<String> data = new ArrayList<>();
        Collections.addAll(data, "A", "B", "A", "C", "C");

        for (int i = data.size(); i > 0; i--) {
            if (i % 2 == 0) {
                data.remove(i - 1);
            }
        }
        System.out.println(data);
    }
}
