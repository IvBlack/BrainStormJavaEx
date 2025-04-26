package ya.contest.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Ищем самую динную строку в массиве строк.
 * */
public class MostLongestStrClass {

    public static void main(String[] args) {

        StringBuilder outputBuffer = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)))) {
            int sentenceLength = Integer.parseInt(br.readLine());
            String inputStr = br.readLine();

            String result = solution(inputStr);
            int maxLength = result.length();

            System.out.println(outputBuffer.append(result).append("\n").append(maxLength));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String solution(String str) {
        String[] crashedStr = str.split(" ");
        String currentStr = " ";

        for (String s: crashedStr) {
            if (s.length() > currentStr.length()) {
                currentStr = s;
            }
        }

        return currentStr;
    }
}
