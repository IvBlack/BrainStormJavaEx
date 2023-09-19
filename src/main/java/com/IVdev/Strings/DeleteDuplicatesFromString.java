package com.IVdev.Strings;

import java.util.*;
import java.util.stream.Collectors;

//есть строка, убрать дубли, вывести в нормальном виде
public class DeleteDuplicatesFromString {
    public static void main(String[] args) {
        String str = "Каааак Дееееелаааа";

        String res = Arrays.stream(str.split(" "))
                .map(s -> Arrays.stream(s.split("")).distinct().collect(Collectors.joining("")))
                .collect(Collectors.joining());

        //String res = str.replaceAll("(\\S)(\\S+\\1)", "$1");
        System.out.println(res);


        //все ниже предложенные решения не решают задачу до конца

        /*
        StringBuilder sb = new StringBuilder();
        int idx;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            idx = str.indexOf(c, i + 1);
            if (idx == -1) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        *************************************

        StringBuilder sb = new StringBuilder();
        str.chars().
                distinct().
                forEach(c -> sb.append((char) c));
        System.out.println(sb);
        */

    }
}
