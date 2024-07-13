package com.IVdev.badcodesnip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
    Some junior code mistakes.
    1. Fail-fast iteration is not allowed to delete element while looping.
    2. Use generics for one type, don't use casting. Use root interface in the left.
        It can help choose any implementation.
* */
public class TenMistakesYouDo {
    public static void main(String[] args) {
//        throwsConcurrentModException();
        doNotThrowsConcurrentModException();
        System.out.println("//=====================================");

        useGenerics();
        System.out.println("//=====================================");

        useEquals();
    }

    // 1.===============resolving ConcurrentModificationException=================
    private static void throwsConcurrentModException() {
        List<String> letters = new ArrayList<>(Arrays
                .asList("a", "x", "u", "W", "z"));
        letters.forEach(l -> {
            if(l.equals("u")) {
                letters.remove(l);
            }
        });
    }

    //fix problem
    private static void doNotThrowsConcurrentModException() {
        List<String> letters = new ArrayList<>(Arrays
                .asList("a", "x", "u", "W", "z"));

        Iterator<String> iterator = letters.iterator();
        while (iterator.hasNext()) {
            String l = iterator.next();
            if(l.equals("u")) {
                iterator.remove();
            }
        }

        //removeIf() allows to escape from while loop =>
//        letters.removeIf(l -> l.equals("u"));

        System.out.println(letters);
    }
    //=========================================================================

    // 2.============================using generics============================
    private static void useGenerics() {
        //not right
//        ArrayList anyType = new ArrayList();
//        anyType.add(10);
//        anyType.add("45");
//        anyType.forEach(
//                t -> System.out.println((int)t + 9)
//        );


        //right
        List<Integer> anyType = new ArrayList<>();
        anyType.add(10);
        anyType.add(45);
        anyType.forEach(
                t -> System.out.println(t + 9)
        );
    }
    //=========================================================================

    // 2.============================using equals()============================
    private  static boolean useEquals() {
        String name1 = "Jorgio";
        String name2 = new String("Jorgio");
//        return name1 == name2; //bad comparison
        return name1.equals(name2);
    }
    //=========================================================================


}
