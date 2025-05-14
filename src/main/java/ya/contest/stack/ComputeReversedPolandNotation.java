package ya.contest.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;


public class ComputeReversedPolandNotation {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)))) {
            String inputStr = br.readLine();

            Double result = solution(inputStr);

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Double solution(String expr) {
        StringBuilder operand = new StringBuilder();
        Stack<Double> stack = new Stack<>();

        // пропусти пробел
        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == ' ') continue;

            // это цифра?
            while (expr.charAt(i) != ' ' && checkPriority(expr.charAt(i)) == 0) {
                operand.append(expr.charAt(i++));

                stack.push(Double.parseDouble(String.valueOf(operand)));
                operand = new StringBuilder(); // обнулить текущий операнд на итерации
            }

            // это оператор?
            if (checkPriority(expr.charAt(i)) > 1) {
                double a = stack.pop();
                double b = stack.pop();

                interface Operation {
                    double apply(double m, double n);
                }

                final Map<Character, Operation> OPERATIONS = Map.of(
                        '+', (m, n) -> a + b,
                        '-', (m, n) -> a - b,
                        '*', (m, n) -> a * b,
                        '/', (m, n) -> a / b
                );

                stack.push(OPERATIONS.get(expr.charAt(i)).apply(b, a));
            }
        }

        return stack.pop();
    }

    private static int checkPriority(char operator) {

        return switch (operator) {
            case '+', '-' -> 2;
            case '*', '/' -> 3;
            default -> 0;
        };
    }
}