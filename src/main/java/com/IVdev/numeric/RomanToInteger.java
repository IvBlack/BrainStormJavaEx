package com.IVdev.numeric;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.random;
import static java.lang.Math.toIntExact;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.solution("MLXI"));
    }

    int solution(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        //если есть элементы и если предыдущий символ меньше по значению, чем последующий - отнимаем
        //иначе - суммируем
        int accum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                accum -= m.get(s.charAt(i));
            } else {
                accum += m.get(s.charAt(i));
            }
        }
        return accum;
    }

/*
The unordered map m is created and initialized with mappings between Roman numeral characters and their corresponding integer values. For example,
'I' is mapped to 1, 'V' to 5, 'X' to 10, and so on.
The variable ans is initialized to 0. This variable will accumulate the final integer value of the Roman numeral string.

The for loop iterates over each character in the input string s.
For the example IX":

When i is 0, the current character s[i] is 'I'. Since there is a next character ('X'),
and the value of 'I' (1) is less than the value of 'X' (10), the condition m[s[i]] < m[s[i+1]] is true.
In this case, we subtract the value of the current character from ans.

ans -= m[s[i]];
ans -= m['I'];
ans -= 1;
ans becomes -1.

When i is 1, the current character s[i] is 'X'. This is the last character in the string,
so there is no next character to compare. Since there is no next character, we don't need to evaluate the condition.
In this case, we add the value of the current character to ans.

ans += m[s[i]];
ans += m['X'];
ans += 10;
ans becomes 9.

For the example "XI":

When i is 0, the current character s[i] is 'X'. Since there is a next character ('I'),
and the value of 'X' (10) is greater than the value of 'I' (1), the condition m[s[i]] < m[s[i+1]] is false.
In this case, we add the value of the current character to ans.

ans += m[s[i]];
ans += m['X'];
ans += 10;
ans becomes 10.

When i is 1, the current character s[i] is 'I'. This is the last character in the string, so there is no next character to compare.
Since there is no next character, we don't need to evaluate the condition.
In this case, we add the value of the current character to ans.

ans += m[s[i]];
ans += m['I'];
ans += 1;
ans becomes 11.

After the for loop, the accumulated value in ans represents the integer conversion of the Roman numeral string, and it is returned as the result.*/
}
