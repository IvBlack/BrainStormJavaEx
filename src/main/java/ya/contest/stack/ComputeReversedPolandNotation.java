package ya.contest.stack;

import java.util.Stack;

public class ComputeReversedPolandNotation {
    public static void main(String[] args) {
        solution("2 1 + 3 *");
    }

    public static Double solution(String expr){
        StringBuilder operand = new StringBuilder();
        Stack<Double> stack = new Stack<>();

        for(int i = 0; i < expr.length(); i++) {
            if (checkPriority(expr.charAt(i)) == ' ') continue;

            while(expr.charAt(i) != ' ' && expr.charAt(i) == 0)  {
               operand.append(expr.charAt(i++));
                stack.push(Double.parseDouble(String.valueOf(operand)));
                operand = new StringBuilder();
            }

            if (checkPriority(expr.charAt(i)) > 1) {
                double a = stack.pop();
                double b = stack.pop();

                if (expr.charAt(i) == '+') stack.push(b + a);
                if (expr.charAt(i) == '-') stack.push(b - a);
                if (expr.charAt(i) == '*') stack.push(b * a);
                if (expr.charAt(i) == '/') stack.push(b / a);
            }
        }
        return stack.pop();
    }

    //
    private static int checkPriority(char operator){

        if (operator == '+' || operator == '-') {
            return 2;
        } else if (operator == '*' || operator == '/') {
            return 3;
        } else return 0;
    }
}
