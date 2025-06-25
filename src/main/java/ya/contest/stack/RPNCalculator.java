package ya.contest.stack;

/*
    Compute postfix poland notation
* */
import java.io.*;
import java.util.*;

class RPNCalculator {
    public int calculate(String[] input) {

        // стек-контейнер
        Stack<String> stack = new Stack<>();

        String operator;

        int a, b;
        String result = "";

        int intermediate = 0;
        String p = ""; // для каста в строку

        // проходим по строке ввода
        for (String s : input) {

            // если не оператор - ложим в стек
            if (!Objects.equals(s, "+") && !Objects.equals(s, "-")
                    && !Objects.equals(s, "*") && !Objects.equals(s, "/")) {
                stack.push(s);
                continue;
            } else {
                // если операнд - применяем к верхним двум операторам в стеке
                operator = s;
            }

            switch (operator) {
                case "+":
                    // вычислили - положили обратно в стек
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    intermediate = a + b;
                    result = p + intermediate;
                    stack.push(result);
                    break;

                case "-":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    intermediate = b - a;
                    result = p + intermediate;
                    stack.push(result);
                    break;

                case "*":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    intermediate = a * b;
                    result = p + intermediate;
                    stack.push(result);
                    break;

                case "/":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());

                    if (b == 0) {
                        System.out.println("Деление на ноль!");
                    }

                    intermediate = b / a;
                    result = p + intermediate;
                    stack.push(result);
                    break;

                default:
            }
        }

        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)))) {
            String[] inputStr = br.readLine().split(" "); // "4 2 * 4 / 25 * 2 - 12 / 1000 + 2 / -999 +"

            RPNCalculator str = new RPNCalculator();
            int result = str.calculate(inputStr);

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
