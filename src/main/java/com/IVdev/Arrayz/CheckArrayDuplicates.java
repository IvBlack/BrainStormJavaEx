package com.IVdev.Arrayz;

import java.sql.SQLOutput;
import java.util.*;

public class CheckArrayDuplicates {
    public static void main(String[] args) {
        checkDuplicates();
    }

    static void checkDuplicates() {
        List<Integer> nums = List.of(52,2,3,4,3,1,2,7,4,3,5,16);
        Set<Integer> set = new LinkedHashSet<>();
        List<Object> duplicates = new ArrayList<>();

        nums.forEach(n -> {
            if (!set.add(n)) {
                duplicates.add(n);
            }
        });
        Iterator<Integer> iterator = set.iterator();
        Integer firstElem = iterator.next();

        for (Integer element : set) {
            System.out.println("2nd unique elem is: " + set.toArray());
        }

        System.out.println("Duplicate elems: " + duplicates);
        System.out.println("First unique elems: " + firstElem);
    }
}
