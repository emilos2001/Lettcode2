package LeetCode.Medium;

import java.util.Stack;

public class ValidParenthesisString {
    public static boolean checkValidString(String s) {
       Stack<Character> parenthesis = new Stack<>();
       Stack<Character> asterics = new Stack<>();
       for (char c : s.toCharArray()){
           if (c == '('){
               parenthesis.push(c);;
           } else if (c == '*') {
               asterics.push(c);
           } else if (c== ')'){
               if (!parenthesis.isEmpty()){
                   parenthesis.pop();
               } else if (!asterics.isEmpty()) {
                   asterics.pop();
               } else {
                   return false;
               }
           }
       }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(checkValidString("(**)"));
    }
}
