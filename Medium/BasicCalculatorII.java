package LeetCode.Medium;

import java.util.Stack;

public class BasicCalculatorII {
    public static int calculator(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char op = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                switch (op) {
                    case '+': stack.push(num);break;
                    case '-': stack.push(-num);break;
                    case '*': stack.push(stack.pop() * num);break;
                    case '/': stack.push(stack.pop() / num);break;
                }
                op = c;
                num = 0;
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculator(s));
    }
}
