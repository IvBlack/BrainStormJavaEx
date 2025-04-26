package ya.contest.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Проверяет строку, введеную в поток ввода,
 *  на признак палиндрома за время О(n)
 * */
class PalindromeResolver {

    public static void main(String[] args) {

        StringBuilder outputBuffer = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)))) {
            String inputStr = br.readLine();
            boolean result = isThisPalindrome(inputStr);

            outputBuffer.append(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    static boolean isThisPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(clean);
        String lower = clean.toLowerCase();
        System.out.println(lower);
        int strLength = lower.length();

        for(int i = 0; i < strLength; i++) {
            if (lower.charAt(i) != lower.charAt(strLength - i - 1)) {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }
}
