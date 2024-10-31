package LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfNumberNumber {
    public static List<String> letterCombination(String digits){
        List<String> list =new ArrayList<>();
        if(digits == null){
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

    private static void backTracking(String digits, int index, StringBuilder comb, List<String> res, Map<Character, String> digitToLetters) {
        if (index == digits.length()) {
            res.add(comb.toString());
            return;
        }
        String letters = digitToLetters.get(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backTracking(digits, index + 1, comb, res, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digit = "4";
        System.out.println(letterCombination(digit));
    }
}

