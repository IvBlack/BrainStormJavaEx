package com.IVdev.Arrayz;

import java.util.Arrays;
import java.util.Scanner;

/*
Create an array of n random integers from the segment [0;n] 
and display it on the screen. Create a second array only from the even elements of 
the first array, if there are any, and display it on the screen.
*/

class SecondEvenNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
       
        int n = 0;
 
        while (n <= 3) {
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n <= 3){
                    System.out.println("The entered number must be greater than 3. Repeat the input:");
                }
            } else {
                System.out.println("You didn't enter a number. Repeat the input:");
                sc.next();
            }
        }
        int [] mas1 = new int[n];
        int evenNums = 0;
 
        for (int i = 0; i < n; i++) {
             mas1[i] = (int)(Math.random()*(n+1));
             if(mas1[i]%2 == 0){
                evenNums++;
            }
        }
        
        System.out.println(Arrays.toString(mas1));
        int [] mas2 = new int[evenNums];
        int index = 0;

        //If the ith element is even, then add it to the second array
        for (int i = 0; i < n; i++) {
             if(mas1[i]%2 == 0){
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }

}