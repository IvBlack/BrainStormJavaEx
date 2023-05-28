package com.IVdev.Arrayz;
import java.util.Arrays;

/*
VertexAcademy
28 May 2023 16:19

Task:
1. Create an array of 40 random integers from the segment [10;99]
2. Display it on the screen in a line.
3. Next, determine and display a message about whether the array is a strictly increasing sequence..
*/

public class CheckIfIncreaseSequence {
    public static void main(String[] args) {
        int mas[] = new int[40];

        //random int from 10 to 99
        for (int i=0; i<mas.length; i++) {
            mas[i] = (int)(Math.random()*90)+10;
        }
        System.out.println(Arrays.toString(mas));

        //insert flag
        boolean flag = true;
        for (int i=1; i<mas.length; i++) {
            if(mas[i]<=mas[i-1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Strongly increasing sequence");
        }
        System.out.println("Not strongly increasing sequence");
    }
}

/*
Salt: What is an array with a strictly increasing sequence?
This means that each next element of the array is larger than the previous one.
Therefore, we create a flag variable that will indicate whether the array is a strictly increasing sequence or not.
Initially, we assume that is.
*/
