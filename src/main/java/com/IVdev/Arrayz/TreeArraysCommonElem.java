package com.IVdev.Arrayz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Даны три неубывающих массива чисел. Найти число, которое присутствует во всех трех массивах.
Целевое решение работает за O(p + q + r),
где p, q, r – длины массивов, доп. память O(1), но эту информацию интервьюер не сообщает
*/

public class TreeArraysCommonElem {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4, 6, 8};
        int[] c = {2, 3, 4, 7};

        List<Integer> commonElements = findCommonElements(a, b, c);
        System.out.println("Common elements: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] a, int[] b, int[] c) {
        List<Integer> commonElements = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                commonElements.add(a[i]);
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
        return commonElements;
    }

    /*
    Альтернатива: .............
    Не самое шустрое решение, но, все-таки: можно перегнать данные из массивов в списки
    ( например a, b, c). Взять самый маленький (например а) список и делать следующее:

        List a1 = Arrays.asList(a);
        List b1 = Arrays.asList(b);
        List c1 = Arrays.asList(c);

        for ( int i = 0; i < a1.size(); i++ ) {
            if ( b1.contains(a1.get(i)) ){
                if ( c1.contains(a1.get(i))) {
                    commonElements.add((Integer)a1.get(i));
                }
            }
        }
    */
}
