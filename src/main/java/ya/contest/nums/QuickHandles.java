package ya.contest.nums;

import java.util.Scanner;

public class QuickHandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем количество клавиш, которые могут нажать оба игрока
        int k = scanner.nextInt() * 2; // Умножаем на 2, так как игроков двое

        // Читаем поле 4x4
        String[] field = new String[4];
        for (int i = 0; i < 4; i++) {
            field[i] = scanner.next();
        }

        // Создаем массив для подсчета количества каждой цифры
        int[] count = new int[10];

        // Подсчитываем количество каждой цифры на поле
        for (String row : field) {
            for (char c : row.toCharArray()) {
                if (c != '.') {
                    count[c - '0']++;
                }
            }
        }

        // Считаем баллы
        int score = 0;
        for (int i = 1; i < 10; i++) {
            if (count[i] <= k) {
                score++;
            }
        }

        System.out.println(score);
    }
//    public static void main(String[] args) throws IOException {
//        solution();
//    }
//
//        public static void solution() throws IOException {
//            BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
//
//            int k = Integer.parseInt(br.readLine()) * 2;
//
//            // Читаем поле 4x4
//            String[] square = new String[4];
//            for (int i = 0; i < 4; i++) {
//                square[i] = br.readLine().replace(".", "");
//            }
//
//            // Создаем массив для подсчета количества каждой цифры
//            int[] count = new int[10];
//
//            // Подсчитываем количество каждой цифры на поле
//            for (String row : square) {
//                for (char c : row.toCharArray()) {
//                    count[c - '0']++;
//                }
//            }
//
//            // Считаем баллы
//            int score = 0;
//            for (int i = 1; i < 10; i++) {
//                if (count[i] <= k) {
//                    score++;
//                }
//            }
//            System.out.println(score);
//        }
}
