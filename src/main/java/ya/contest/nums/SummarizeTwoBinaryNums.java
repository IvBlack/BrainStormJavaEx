package ya.contest.nums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Итеративно складывает два бинарных числа.
 * */
public class SummarizeTwoBinaryNums {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)))) {
            String firstBinaryNum = br.readLine();
            String secondBinaryNum = br.readLine();

            System.out.println(binarySolution(firstBinaryNum, secondBinaryNum));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  static String binarySolution(String num1, String num2){
        String res = "";

        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int delta = num1.length() - num2.length();
        String newNum2 = "0".repeat(delta) + num2;
        int carry = 0;


        for (int i = num1.length() - 1; i > -1; i--){
           int sum =  Character.getNumericValue(num1.charAt(i))
                   + Character.getNumericValue(newNum2.charAt(i)) + carry;
           if (sum > 1){
               sum -= 2;
               carry = 1;
           } else {
               carry = 0;
           }
           res = sum + res;

           if(carry != 0){
               res = 1 + res;
           }
        }
        return res;
    }
}
