package LeetCode.Medium;

import java.util.HashMap;

public class MaxNumberOfBallons {
    public static int maxNumberOfBalloons(String text){
        int max = Integer.MAX_VALUE;
        String balloon = "balloon";
        HashMap<Character, Integer> textMap = new HashMap<>();
        HashMap<Character, Integer> balloonMap = new HashMap<>();
        for (char c : text.toCharArray()){
            c = Character.toLowerCase(c);
            textMap.put(c, textMap.getOrDefault(c, 0) + 1);
        }
        for (char c : balloon.toCharArray()){
            c = Character.toLowerCase(c);
            balloonMap.put(c, balloonMap.getOrDefault(c, 0) + 1);
        }
        for (char c : balloonMap.keySet()){
            if (!textMap.containsKey(c)){
                return 0;
            }
            max = Math.min(max, textMap.get(c) / balloonMap.get(c));
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "nlaebolko";
        int max = maxNumberOfBalloons(str);
        System.out.println(max);
    }
}
