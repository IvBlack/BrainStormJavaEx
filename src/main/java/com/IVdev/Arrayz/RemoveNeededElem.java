package com.IVdev.Arrayz;

import java.util.Arrays;

public class RemoveNeededElem {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,3,5,6,8,7,7,9,8,7};
        int val = 2;

        RemoveNeededElem rin = new RemoveNeededElem();
        rin.removeElement(arr, val);
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    /*
    Интуиция этого решения: перебирать массив и отслеживать два указателя: index и i.
    Указатель index представляет позицию, в которой должен быть помещен следующий нецелевой элемент,
    а указатель i перебирает элементы массива. Заменяя целевые элементы нецелевыми элементами,
    решение эффективно удаляет все вхождения целевого значения из массива.
    */
}
