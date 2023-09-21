package com.IVdev.Arrayz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Find even, odd array/collection elements. Remove duplicates.
And display it on the screen.
*/
public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        int arr[] = {2,5,5,5,8,4,5,6,8,5,3,4,9};
        printNums(arr);
    }

    //решение объединяет поиск, сортировку, дублей в масиве/коллекции
    public static void printNums(int[] arr) {
        System.out.println
        (
            IntStream.of(arr)
                .filter(i -> (i & 1) == 1) //либо нечетные
//                .filter(i -> (i & 1) == 0) //либо четные элементы
                .mapToObj(Integer::toString)
                .distinct()
//                .sorted()
            .collect(Collectors.joining(", "))
        );
    }

/*
public static void main (String[] args) {
    ArrayList<String> data = new ArrayList<>();
    Collections.addAll(data,"A", "B", "A", "C", "C");

    // удалить из листа все чётные элементы
    for (int i = data.size(); i > 0; i--) {
        if(i % 2 == 0) {
            data.remove(i - 1);
        }
        System.out.println(data);
    }
*/
}
