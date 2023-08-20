package com.IVdev.Logical;

//что выведет sout?
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

/*
Answer: 5,6
в 1 случае это примитив, там нет ссылок
во 2 случае - создается новый объект, на который ссылка никуда не передается дальше.
*/
