package LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfNumberNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return list;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backTracking(digits, 0, new StringBuilder(), list, map);
        return list;
    }

    private static void backTracking(String digits, int index, StringBuilder builder, List<String> res, Map<Character, String> map){
        if (index == digits.length()){
            res.add(builder.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for (char letter : letters.toCharArray()){
            builder.append(letter);
            backTracking(digits, index + 1, builder, res, map);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
