package com.IVdev.Logical;


public class Logical060823 {
    static int x = 5;

    //почему x = 1?
    public static void main(String[] args) {
        int x = 0;
        int y = 5;

        if(y > 3) x = 1;
        System.out.println(x);
    }
}

/*
Answer: 1
x инициализируется внутри скоупа метода
*/
