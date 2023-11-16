package com.IVdev.Arrayz;

import java.util.HashMap;
import java.util.Map;

public class TwoIndicesOfSum {
    int target = 14;
    static int[] nums = {2,7,11,15,6,3,0,1};

    public static void main(String[] args) {
        TwoIndicesOfSum twoSum = new TwoIndicesOfSum();
        twoSum.twoSum(nums, twoSum.target);
    }

    //brute force of O(n^2).
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }

    //Solution 2: (One-pass Hash Table)
//    Map<Integer, Integer> numMap = new HashMap<>();
//    int n = nums.length;
//        for (int i = 0; i < n; i++) {
//        int complement = target - nums[i];
//        if (numMap.containsKey(complement)) {
//            return new int[]{numMap.get(complement), i};
//        }
//        numMap.put(nums[i], i);
//    }
//        return new int[]{}; // No solution found

/*
1. Create an empty hash table to store elements and their indices.
2. Iterate through the array from left to right.
3. For each element nums[i], calculate the complement by subtracting it from the target: complement = target - nums[i].
4. Check if the complement exists in the hash table. If it does, we have found a solution.
5. If the complement does not exist in the hash table, add the current element nums[i] to the hash table with its index as the value.
6. Repeat steps 3-5 until we find a solution or reach the end of the array.
If no solution is found, return an empty array or an appropriate indicator.
*/
}
