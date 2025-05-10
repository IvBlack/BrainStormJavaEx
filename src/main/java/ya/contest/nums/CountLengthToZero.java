package ya.contest.nums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * https://contest.yandex.ru/contest/22450/run-report/137363529/
 * */
public class CountLengthToZero {
        public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)))) {
            String inputStr = br.readLine();
            String inputStr2 = br.readLine();
            String[] replaced = inputStr2.split(" ");

            int [] inputArr = new int[replaced.length];

            for (int i = 0; i < replaced.length; i++){
                inputArr[i] = Integer.parseInt(replaced[i]);
            }

            String result = findNearestDistanceToZeros(inputArr);

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String findNearestDistanceToZeros(int[] nums) {
        int n = nums.length;
        int[] arrayResult = new int[n];

        int[] distanceToLeftZero = new int[n];
        int[] distanceToRightZero = new int[n];

        // ищем расстояние до нулей слева
        int lastZero = -n;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                lastZero = i;
            }
            distanceToLeftZero[i] = i - lastZero;
        }

        // и до нулей справа
        lastZero = 2 * n;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                lastZero = i;
            }
            distanceToRightZero[i] = lastZero - i;
        }

        // минимальное расстояние из двух массивов
        for (int i = 0; i < n; i++) {
            arrayResult[i] = Math.min(distanceToLeftZero[i], distanceToRightZero[i]);
        }

        return String.join(" ", Arrays.stream(arrayResult)
                .mapToObj(String::valueOf)
                .toArray(String[]::new));
    }
}

//    public static void main(String[] args) {
//        int[] nums = {1, 0, 2, 1, 5, 8,   0, 3};
//        int[] result = findNearestZeros(nums);
//        System.out.println(Arrays.toString(result)); // [1, 0, 1, 0, 1]
//    }

//    public  static List<Integer> findDistanceToZero(List<Integer> nums) {
//
//        List<Integer> arrWithZeroID = new ArrayList<>();
//        int zeroID = 0;
//        List<Integer> arrResult = new ArrayList<>();
//
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i) == 0) {
//                arrWithZeroID.add(i);
//            }
//        }
//
//        for (int k = 0; k < nums.size(); k++) {
//
//            if (nums.get(k) == 0) {
//                arrResult.add(0);
//            } else {
//                arrResult.add(Math.abs(arrWithZeroID.get(zeroID) - k));
//            }
//
//            if ((zeroID + 1) < arrWithZeroID.size() &&
//                    ((arrWithZeroID.get(zeroID) + arrWithZeroID.get(zeroID + 1) / 2) <= k))
//            {
//                zeroID += 1;
//            }
//        }
//        return arrResult;
//    }
