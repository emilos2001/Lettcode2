package LeetCode.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringsWithConcatenationOfAllWords {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word : words) {
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        int n = s.length();
        int m = words.length;
        int w = words[0].length();
        for (int i = 0; i < w; i++) {
            HashMap<String, Integer> temp = new HashMap<>();
            int count = 0;
            for (int j = i, k = i; j + w <= n; j += w) {
                String x = s.substring(j, j + w);
                temp.put(x, temp.getOrDefault(x, 0) + 1);
                count++;
                if (count == m) {
                    if (hashMap.equals(temp)) {
                        list.add(k);
                    }
                    String remove = s.substring(k, k + w);
                    temp.computeIfPresent(remove, (a, b) -> (b > 1) ? b - 1 : null);
                    count--;
                    k += w;
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] wrds = {"foo", "bar"};
        List<Integer> list = findSubstring(s, wrds);
        for (int i: list){
            System.out.println(i);
        }
    }
}
