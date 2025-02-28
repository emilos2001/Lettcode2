package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
      for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i));
            } else {
                res += map.get(s.charAt(i));
            }
       }
//        for (int i = 0; i < s.length(); i++) {
//            int current = map.get(s.charAt(i));
//            if (i + 1 < s.length()) {
//                int next = map.get(s.charAt(i + 1));
//                if (current < next) {
//                    res -= current;
//                    continue;
//                }
//            }
//            res += current;
//        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
