package ya.contest.nums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://contest.yandex.ru/contest/22450/run-report/137510025/
 * */
public class QuickHandles {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader
                (
                    new BufferedReader(new InputStreamReader(System.in))
                );

        final int GAMERS = 2;
        final int FIELD4X4 = 4;
        final int HELP_SIZE_ARR = 10;

        int k = Integer.parseInt(br.readLine()) * GAMERS;

        String[] nums = new String[FIELD4X4];
        for (int i = 0; i < FIELD4X4; i++) {
            nums[i] = br.readLine().replace(".", "");
        }

        //вспомогательный массив для хранения сумм цифр на табло
        int[] helpArr = new int[HELP_SIZE_ARR];

        // исключаем выход за пределы
        for (String elem : nums) {
            for (char c : elem.toCharArray()) {
                helpArr[c - '0']++;
            }
        }

        // фильтруем, мапим результат
        int points = 0;
        for (int i = 1; i < 10; i++) {
            if (helpArr[i] != 0 && helpArr[i] <= k) {
                points++;
            }
        }
        System.out.println(points);
    }
}