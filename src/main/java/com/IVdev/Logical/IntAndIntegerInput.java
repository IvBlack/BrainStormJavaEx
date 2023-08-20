package com.IVdev.Logical;

public class IntAndIntegerInput {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 6;

        inc(a);
        inc(b);

        System.out.println(a);
        System.out.println(b);
    }

    public static void inc(int c) {
        c = c + 1;
    }

    public static void inc(Integer c) {
        c = new Integer(c + 1);
    }
}
