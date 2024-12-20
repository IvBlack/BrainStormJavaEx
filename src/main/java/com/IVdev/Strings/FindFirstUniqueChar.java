package com.IVdev.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
    Не совсем оптимальное решение по поиску первого уникального символа
    в подаваемой на вход строке.

    Временная сложность - O(n), один проход.
    Память - близко к O(n) при небольших входных данных?
* */

public class FindFirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(findFirstUniqueChar("adcd"));
        System.out.println(findFirstUniqueChar("adcda"));
        System.out.println(findFirstUniqueChar("adcdba"));
        System.out.println(findFirstUniqueChar("xiuvf77wkiujfvxvwr8"));
    }

    static Character findFirstUniqueChar(String in) {
        if (in == null || in.isEmpty()) {
            return 0;
        }

        Set<Character> unique = new LinkedHashSet<>();
        Set<Character> aintUnique = new HashSet<>();
        for(Character n : in.toCharArray()) {
            if (!aintUnique.contains(n) && unique.contains(n)) {
                aintUnique.add(n);
                unique.remove(n);
            } else {
                unique.add(n);
            }
        }

        return unique.stream().findFirst().orElseThrow();
    }
}