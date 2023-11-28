package com.IVdev.Arrayz;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        maxSumSubArray.solution(arr);
    }
/*
Найти subarray с максимальной суммой
*/
    int solution(int[] arr) {
        int maxSum = arr[0];
        int curSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curSum = Math.max(arr[i], curSum + arr[i]);
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }

    /*
    Интуиция кода заключается в том, чтобы найти максимальную сумму непрерывного подмассива в заданных числах массива.
    Это делается путем сканирования массива и отслеживания текущей суммы подмассива.
    Всякий раз, когда текущая сумма становится больше максимальной суммы, обнаруженной на данный момент,
    максимальная сумма обновляется.
    Если текущая сумма становится отрицательной, она сбрасывает сумму до 0 и начинает новый подмассив.
    К концу цикла код возвращает найденную максимальную сумму.
    */
}
