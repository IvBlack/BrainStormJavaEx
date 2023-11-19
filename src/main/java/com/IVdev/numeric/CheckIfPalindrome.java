package com.IVdev.numeric;

public class CheckIfPalindrome {

    /*Проверить, является ли входное число палиндромом*/
    public static void main(String[] args) {
        CheckIfPalindrome checkIfPalindrome = new CheckIfPalindrome();
        checkIfPalindrome.isPalindrome(334);
    }
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return (reversed == x);
    }
}
/* Salt:
Интуиция, стоящая за этим кодом, заключается в том,
чтобы перевернуть все входное число и проверить, равно ли перевернутое число исходному номеру.
Если они совпадают, то число является палиндромом.
*/
