package ya.contest.arrays;

import java.io.IOException;
import java.util.Scanner;

/*
    Простое танспонирование матрицы чисел размером n x m
* */
public class TransposeMatrix {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        // размер матрицы из консоли
        int n_rows = scanner.nextInt();
        int m_columns = scanner.nextInt();
        scanner.nextLine();

        // шаблон матрицы с заданными размерами
        int[][] matrix = new int[n_rows][m_columns];

        // построчное чтение
        for (int i = 0; i < n_rows; i++) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != m_columns) {
                throw new IllegalArgumentException("Размерность матрицы не верна.");
            }
            for (int j = 0; j < m_columns; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j]);
            }
//            System.out.println(Arrays.deepToString(matrix));
        }

        for (int i = 0; i < n_rows; i++) {
            for (int j = 0; j < m_columns; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
