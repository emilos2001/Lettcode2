package LeetCode.Easy;

import java.util.HashMap;

public class CanConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.get(c) - 1);
            if (map.containsKey(c) || map.get(c) != 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean res = canConstruct("aa", "aab");
        System.out.println(res);
    }
}
