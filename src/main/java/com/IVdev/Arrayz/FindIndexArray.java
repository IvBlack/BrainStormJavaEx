package com.IVdev.Arrayz;

//Write a Java program to find the index of an array element.

public class FindIndexArray {
    public static void main(String[] args) {
        int[] myArr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is: " + findIndex(myArr, 13));
        System.out.println("Index position of 77 is: " + findIndex(myArr, 23));
    }

    public static int findIndex(int[] myArr, int t) {
        if (myArr==null) return -1;
        int len = myArr.length;
        int i = 0;

        //while array contains elements
        while (i < len) {
            if (myArr[i] == t) return i; //check the position
            else i=i+1; //or step to next
        }
        return -1;
    }
}
