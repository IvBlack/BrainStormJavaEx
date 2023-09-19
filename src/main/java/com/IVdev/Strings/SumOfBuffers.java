package com.IVdev.Strings;

public class SumOfBuffers {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("open");
        StringBuffer str2 = str1;
        str1.append("genius");
        System.out.println(str1 + " " + str2 + " " +  (str1 == str2));
    }
}
