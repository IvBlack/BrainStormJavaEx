package com.IVdev.Arrayz;

/*
    Найти subarray с максимальной суммой.
*/
public class MaxSumSubArray {

    static int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

    public static void main(String[] args) {
        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        maxSumSubArray.cleanSolution(arr);
        System.out.println(maxSumSubArray.dirtySolution(arr));
    }

    //clean code
    int cleanSolution(int[] arr) {
        int maxSum = arr[0];
        int curSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curSum = Math.max(arr[i], curSum + arr[i]);
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }

    //dirty
    int dirtySolution(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i=0; i<arr.length; i++) {
            currentSum += arr[i];

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            if(currentSum < 0) {
                //обнуляем, начинаем с текущего элемента
                currentSum = 0;
            }
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
