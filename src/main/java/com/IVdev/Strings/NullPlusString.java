package com.IVdev.Strings;

/*
One of the operands in the concatenation expression is a string (in this case it is "Hello"),
Java automatically converts the other operand to a string.
Thus, null will be interpreted as a "null" string.
*/

public class NullPlusString {
    public static void main(String[] args) {
        String s = null;
        s += "Hallo!";
        System.out.println(s);
    }
}
