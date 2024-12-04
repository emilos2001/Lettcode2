package LeetCode.Medium;

import java.util.Arrays;
import java.util.Stack;

public class SimplifyPath {
    public static String path(String path){
        Stack<String> stack = new Stack<>();
        String[] directory = path.split("/");
        for(String tokens : directory){
            if (tokens.equals(".") || tokens.isEmpty()){
                continue;
            }
            if (tokens.equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(tokens);
            }
        }
        return "/" + String.join("/", stack);
    }

    public static void main(String[] args) {
        String path = "/home//foo//";
        System.out.println(path(path));
    }
}
