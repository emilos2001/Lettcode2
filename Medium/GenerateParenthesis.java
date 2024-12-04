package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int open = 0;
        int close = 0;
        backTracking(open, close, "", n, list);
        return list;
    }

    static void backTracking(int open, int close, String s, int n, List<String> list) {
        if (open == close && open + close == 2 * n) {
            list.add(s);
            return;
        }
        if (open < n) {
            backTracking(open + 1, close, s + "(", n, list);
        }
        if (open > close) {
            backTracking(open, close + 1, s + ")", n, list);
        }
    }

    public static void main(String[] args){
        System.out.println(generateParenthesis(3));
    }
}
