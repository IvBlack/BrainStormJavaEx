package com.IVdev.Arrayz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Найти пересечение двух массивов в Java*/
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 10, 122};
        int[] arr2 = {4, 5, 6, 7, 8,23,2,10};

        Solution.intersection(arr1, arr2);
    }
    static class Solution {
        public static void intersection(int[] nums1, int[] nums2) {
            Integer[] aInt1 = new Integer[nums1.length];
            Integer[] aInt2 = new Integer[nums2.length];

            Arrays.setAll(aInt1, i -> nums1[i]);
            Arrays.setAll(aInt2, i -> nums2[i]);

            Set<Integer> set1 = new HashSet<>(Arrays.asList(aInt1));
            Set<Integer> set2 = new HashSet<>(Arrays.asList(aInt2));

            set1.retainAll(set2); // Оставляем только общие элементы
            Integer[] intersection = set1.toArray(new Integer[0]);

            System.out.println(Arrays.toString(intersection));
        }
    }
    /*
    Создаем два массива arr1 и arr2, преобразуем в коллекции HashSet,
    чтобы убрать дубликаты, затем используем метод retainAll() для получения только тех элементов,
    что являются общими для обоих массивов.
    */

    //***************************** альтернатива *******************************
//            Set<Integer> set1 = new HashSet<>();
//            for (int n1:nums1
//            ) {
//                set1.add(n1);
//            }
//            Set<Integer> set2 = new HashSet<>();
//            for (int n2:nums2
//            ) {
//                if(set1.contains(n2)) {
//                    set2.add(n2);
//                }
//            }
//
//            int[] result = new int[set2.size()];
//            int i =0;
//            for (int x:set2
//            ) {
//                result[i] = x;
//                i++;
//            }
//            return result;
}
