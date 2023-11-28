package com.IVdev.Arrayz;

import java.util.*;

public class CheckArrayDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{52,2,3,4,3,1,2,7,4,3,5,16};
//        checkDuplicates();
        checkIfExistDupLogO(nums);
    }

    static void checkDuplicates() {
        List<Integer> nums = List.of(52,2,3,4,3,1,2,7,4,3,5,16);
        Set<Integer> set = new LinkedHashSet<>();
        List<Object> duplicates = new ArrayList<>();

        nums.forEach(n -> {
            if (!set.add(n)) {
                duplicates.add(n);
            }
        });
        Iterator<Integer> iterator = set.iterator();
        Integer firstElem = iterator.next();

        System.out.println("Duplicate elems: " + duplicates);
        System.out.println("First unique elems: " + firstElem);

        // Accessing elements by index
        Integer[] Geeks = set.toArray(new Integer[set.size()]);
        System.out.println("2nd unique elem is: "
                + Geeks[1]);
    }


    //найти первый дубль в массиве, O(n^2) solution
    public boolean checkIfExistDup(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    /*
    Подход, основанный на наборе хэшей, использует структуру данных набора хэшей для хранения встречающихся элементов.
    Он выполняет итерацию по массиву, проверяя, есть ли элемент уже в наборе.
    Если да, он возвращает значение true.
    В противном случае он добавляет элемент в набор. Этот подход имеет временную сложность O(n)
    и обеспечивает эффективный способ проверки на наличие дубликатов.
    */
    public static boolean checkIfExistDupLogO(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
