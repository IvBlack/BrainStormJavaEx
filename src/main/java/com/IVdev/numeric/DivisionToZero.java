package com.IVdev.numeric;

/*
Java follows IEEE standards, so for floating point operations such as this, Infinity is correct.
Had it been 1/0, an ArithmeticException would have occurred, because in integer division, division by zero is not allowed;
there is no int representation for infinity.
*/
public class DivisionToZero {
    public static void main(String[] args) {
        double d = 10.0/0;
        System.out.println(d);
//        System.out.println(new Integer(1)/ new Double(0));
    }
}
