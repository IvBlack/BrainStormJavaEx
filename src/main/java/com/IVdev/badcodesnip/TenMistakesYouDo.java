package com.IVdev.badcodesnip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
    Some junior code mistakes.
    1. Fail-fast iteration is not allowed to delete element while looping.
* */
public class TenMistakesYouDo {
    public static void main(String[] args) {
//        throwsConcurrentModException();
        doNotThrowsConcurrentModException();
        System.out.println("//=====================================");
    }

    //1. ===============resolving ConcurrentModificationException=================
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
}
