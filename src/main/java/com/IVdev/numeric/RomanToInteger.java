package com.IVdev.numeric;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.solution("MLIX"));
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


        int accum = 0;
        for (int i = 0; i < s.length(); i++) {
            //если есть элементы и если предыдущий символ меньше по значению, чем последующий - отнимаем
            //иначе - суммируем
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                accum -= m.get(s.charAt(i));
            } else {
                accum += m.get(s.charAt(i));
            }
        }
        return accum;
    }
}
