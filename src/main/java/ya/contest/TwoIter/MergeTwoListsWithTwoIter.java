package ya.contest.TwoIter;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {
//    public static void main(String[] args) throws IOException {
//        StringBuilder outputBuffer = new StringBuilder();
//
//        System.out.println("первый массив: ");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//
//        // Читаем количество элементов в массиве
//        int arrayLength = Integer.parseInt(reader.readLine());
//
//        // Читаем первый массив
//        List<Integer> firstArray = readArray(reader.readLine(), arrayLength);
//
//
//        System.out.println("второй массив: ");
//        int arrayLength2 = Integer.parseInt(reader.readLine());
//        List<Integer> secondArray = readArray(reader.readLine(), arrayLength2);
//
//        // Здесь можно вызывать твою функцию List<Integer> result = zip(firstArray, secondArray);
//        List<Integer> result = zip(firstArray, secondArray);
//
//        // Для примера можно вывести то, что прочитали. При сдаче в outputBuffer должны писать только result
////        outputBuffer.append(arrayLength).append("\n");
////        outputBuffer.append(firstArray).append("\n");
////        outputBuffer.append(secondArray).append("\n");
//
//        // Пишем результат в output Buffer
////        outputBuffer.append(result).append("\n");
//
//        System.out.println(outputBuffer); // Пишем результат в System.out
//    }

    public static void main(String[] args) {
//        List<Integer> firstArray = new ArrayList<>(Arrays.asList(2, 2, 4, 8));
//        List<Integer> secondArray = new ArrayList<>(Arrays.asList(1, 2, 3, 6));

        //читаем массив
        readArray();


//        System.out.println(zip(firstArray, secondArray));
    }

    private static List<Integer> zip(List<Integer> a, List<Integer> b) {

        if(a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }

        int j = 0;
        int k = 0;

        int aLength = a.size();
        int bLength = b.size();

        List<Integer> commonList = null;

        while(j < aLength && k < bLength) {
            assert false;
            if(a.get(j) <= b.get(k)){
                commonList.add(a.get(j));
                j+= 1;
            } else {
                commonList.add(b.get(k));
                k+= 1;
            }
        }

        while (j < aLength) commonList.add(a.get(j++));
        while (k < bLength) commonList.add(b.get(k++));

        return commonList;
    }

//    private static List<Integer> readArray(String input, int arrayLength) {
//        StringTokenizer tokenizer = new StringTokenizer(input);
//        List<Integer> array = new ArrayList<>(arrayLength);
//        while (tokenizer.hasMoreTokens()) {
//            array.add(Integer.parseInt(tokenizer.nextToken()));
//        }
//        return array;
//    }

    private static List<Integer> readArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер списка:");
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Введите элементы списка:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Полученный список: " + list);
        sc.close();
        return list;
    }
}



