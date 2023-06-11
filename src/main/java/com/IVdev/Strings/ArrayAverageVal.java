package com.IVdev.Strings;

/*Write a Java program to calculate the average value of
array elements.
*/

public class ArrayAverageVal {
    public static void main(String[] args) {
        int[] nums = new int[]{20, 30, 25, 35, -16, 60, -100};

        int sum = 0;
        for (int i=0; i <nums.length; i++){
            sum = sum + nums[i];
        }

        double average = sum / nums.length;
        System.out.println("Average value of the elements is: " + average);
    }
}
