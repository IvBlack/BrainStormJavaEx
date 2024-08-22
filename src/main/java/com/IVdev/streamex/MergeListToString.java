package com.IVdev.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeListToString {
    private static final List<String> LIST_TO_APPEND = Arrays.asList(
            "Milan",
            "London",
            "New York",
            "San Francisco"
    );
    public static void main(String[] args) {
        appendByIterative();
        appendSinceJava8();
    }

    public static void appendByIterative() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < LIST_TO_APPEND.size(); i++) {
            res.append(LIST_TO_APPEND.get(i));

            if (i < LIST_TO_APPEND.size() - 1) {
                res.append("->");
            }
        }
        System.out.println(res);
    }

    public static void appendSinceJava8() {
        System.out.println(
            String.join(" - ", LIST_TO_APPEND)
        );
    }
}
