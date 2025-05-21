//package ya.contest.queue;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//
//// Тестовый класс, для обката сниппетов.
//public class Test {
//
////    Исходная матрица:
////            1 2 3 4
////            5 6 7 8
////            9 10 11 12
//    public static void main(String[] args) throws IOException {
//
//        // Исходная матрица 3x4
//        int[][] inputData = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//        // Транспонируем матрицу
//        int[][] transposed = revert(inputData);
//
//        // Выводим результат
//        System.out.println("Исходная матрица:");
//        printMatrix(inputData);
//
//        System.out.println("\nТранспонированная матрица:");
//        printMatrix(transposed);
//    }
//
//    public static int[][] revert(int[][] matrix) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // Получаем размеры исходной матрицы
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//
//        // Создаем новую матрицу с переставленными размерами
//        int[][] result = new int[n][m];
//
//        // считываем матрицу полинейно
//        for (int i = 0; i < rows; i++) {
//            String line = scanner.nextLine();
//            String[] numbers = line.split(" ");
//            if (numbers.length != cols) {
//                throw new IllegalArgumentException("Неверное количество элементов в строке");
//            }
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = Integer.parseInt(numbers[j]);
//            }
//        }
//
//        // Заполняем новую матрицу
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                result[j][i] = matrix[i][j];
//            }
//        }
//        return result;
//    }
//
//    // Метод для вывода матрицы
//    public static void printMatrix(int[][] matrix) {
//        for (int[] row : matrix) {
//            for (int element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
//    }
//}
