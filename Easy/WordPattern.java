package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern (String pattern, String s){
        boolean isValid = true;
        String[] words = s.split(" ");
        if (words.length != s.length()){
            isValid = false;
        }
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if (!charToWord.containsKey(c)){
                charToWord.put(c, word);
            } else if (!charToWord.get(c).equals(word)) {
                isValid = false;
            }
            if (!wordToChar.containsKey(word)){
                wordToChar.put(word, c);
            } else if (!wordToChar.get(word).equals(c)) {
                isValid= false;
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        boolean res = wordPattern(pattern, s);
        System.out.println(res);
    }
}
