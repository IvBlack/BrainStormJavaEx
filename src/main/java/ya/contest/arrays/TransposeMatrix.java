package ya.contest.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) throws IOException {

//        4
//        3
//        1 2 3
//        0 2 6
//        7 4 1
//        2 7 0


        BufferedReader br = new BufferedReader
                (
                        new BufferedReader(new InputStreamReader(System.in))
                );

        int n_rows = Integer.parseInt(br.readLine());
        int m_columns = Integer.parseInt(br.readLine());

        Scanner scanner = new Scanner(System.in);

        // Создаем матрицу
        int[][] fromInputMatrix = new int[n_rows][m_columns];

        // Считываем элементы построчно
        // Считываем элементы построчно
        for (int i = 0; i < n_rows; i++) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != m_columns) {
                throw new IllegalArgumentException("Неверное количество элементов в строке");
            }
            for (int j = 0; j < m_columns; j++) {
                fromInputMatrix[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        // Выводим матрицу
        System.out.println("Введенная матрица:");
        for (int i = 0; i < n_rows; i++) {
            for (int j = 0; j < m_columns; j++) {
                System.out.print(fromInputMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();


//        TransposeMatrix tp = new TransposeMatrix();
//        tp.revert(fromInputMatrix);
    }

//    public int[][] revert(int[][] input) {
//
//        int[][] result = new int [][]{};
//        // Заполняем новую матрицу
//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < n; j++) {
//                result[j][i] = input[i][j];
//            }
//        }
//        return result;
//    }
}
