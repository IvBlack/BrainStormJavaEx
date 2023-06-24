package com.IVdev.Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Complete the method/function so that it converts dash/underscore
delmited words into camel casing. The first word within the output should be
capitalized only if the original word was capitalized.
*/
public class DashToCamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("last-in-first-out"));
        System.out.println(toCamelCase("Last_in_first_out"));
    }

    static String toCamelCase(String input) {
        var strings = input.split("[-_]");
        return strings[0].concat(Arrays.stream(strings)
                .sequential()
                .skip(1)
                .map(DashToCamelCase::capitalizeFirst)
                .collect(Collectors.joining()));
    }

    private static String capitalizeFirst(String s) {
        return s.substring(0,1)
                .toUpperCase()
                .concat(s.substring(1));
    }
}
