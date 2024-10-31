package LeetCode.Hard;

import java.util.Stack;

public class LongestValidParanthesis {
    public static int longestValidParentheses(String s){
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()){
                    stack.push(i);
                } else {
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "(()";
        int ans = longestValidParentheses(s);
        System.out.println(ans);
    }
}

