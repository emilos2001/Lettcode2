package LeetCode.Medium;

import java.util.Stack;

public class PolishReverse {
    public static int evalPRN(String[] strings) {
        int prn;
        Stack<Integer> stack = new Stack<>();
        for (String token : strings) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> {
                    int j = stack.pop();
                    int k = stack.pop();
                    stack.push(k - j);
                }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    int j = stack.pop();
                    int k = stack.pop();
                    stack.push(k / j);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }
        prn = stack.pop();
        return prn;
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evalPRN(tokens));
    }
}
