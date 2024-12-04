package LeetCode.Medium;

import java.util.*;

public class GroupOfAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> listMap = new HashMap<>();
        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sort = new String(chars);
            if (!listMap.containsKey(sort)){
                listMap.put(sort, new ArrayList<>());
            }
            listMap.get(sort).add(s);
        }
        return new ArrayList<>(listMap.values());
    }
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println(result);
    }
}
