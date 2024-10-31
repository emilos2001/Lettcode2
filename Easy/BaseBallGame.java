package LeetCode.Easy;

import java.util.Stack;

public class BaseBallGame {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for (String operation : operations) {
            switch (operation) {
                case "+": {
                    int top = stack.pop();
                    int newTop = stack.peek() + top;
                    stack.push(top);
                    stack.push(newTop);
                    break;
                }
                case "C": {
                    stack.pop();
                    break;
                }
                case "D": {
                    stack.push(2 * stack.peek());
                    break;
                }
                default: {
                    stack.push(Integer.parseInt(operation));
                }
            }
        }
        while (!stack.isEmpty()) {
            score += stack.pop();
        }
        return score;
    }
    public static void main(String[] args) {
        String[]operations = {"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }
}
