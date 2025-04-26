package ya.contest.nums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Определяет, являются ли три случайных числа
 * числами одной четности.
 * */
public class ThreeRandomOddNums {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)))) {
            String inputStr = br.readLine();
            String[] str1 = inputStr.split(" ");

            int inputA = Integer.parseInt(str1[0]);
            int inputB = Integer.parseInt(str1[1]);
            int inputC = Integer.parseInt(str1[2]);

            evenOddSolution(inputA, inputB, inputC);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void evenOddSolution(int x, int y, int z){

        int absoluteX = Math.abs(x);
        int absoluteY = Math.abs(y);
        int absoluteZ = Math.abs(z);

        if((absoluteX % 2 == 0 &&
            absoluteY % 2 == 0 &&
            absoluteZ % 2 == 0)
                || (absoluteX % 2 != 0 &&
                    absoluteY % 2 != 0 &&
                    absoluteZ % 2 != 0)) {
            System.out.println("WIN");
        } else {
            System.out.println("FAIL");
        }
    }
}
