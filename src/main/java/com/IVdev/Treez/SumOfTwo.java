package com.IVdev.Treez;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwo {
    //Task: find int pair amount in array, equals k.
    //int[] nums = [-3, 0, 1, 3 ,4], k = 5

    int [] twoSum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i < nums.length; i++) {
            int secondNumber = k - nums[i]; //second int from pair

            //if Set contains second number - it's our int
            if(set.contains(secondNumber)) {
                return new int[] {secondNumber, nums[i]};
            }
            //if not - add current int to set
            set.add(nums[i]);
        }
        return new int[0];
    }

    /*
    Salt: hashset finds number in yourself very quickly. Go through
    array and compare each index with second number.
    Of course at first set will be empty.
    */
}
