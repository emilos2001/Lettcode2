package LeetCode.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int longestSubstring (String word) {
        Set<Character> set = new HashSet<>();
        int j = 0;
        int max = 0;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (set.contains(c)){
                set.remove(word.charAt(j));
                j++;
            }
            set.add(c);
            max = Math.max(max,  i - j + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String word = "abcabcbb";
        System.out.println(longestSubstring(word));
    }
}
