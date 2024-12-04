package LeetCode.Medium;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> builderStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)){
                k = k * 10 +(c - '0');
            } else if (c == '[') {
                countStack.push(k);
                builderStack.push(sb);
                sb = new StringBuilder();
                k= 0;
            } else if (c == ']'){
                StringBuilder decode = builderStack.pop();
                int repeat = countStack.pop();
                for (int i = 0; i < repeat; i++){
                    decode.append(sb);
                }
                sb = decode;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
