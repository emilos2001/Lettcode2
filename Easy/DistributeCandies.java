package LeetCode.Easy;

import java.util.HashMap;
import java.util.HashSet;

public class DistributeCandies {
    public static int distributesCandies(int[] candies) {
        if (candies == null || candies.length == 0) {
            return 0;
        }
        int different = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }
        different = candies.length / 2;
        return Math.min(set.size(), different);
    }

    public static void main(String[] args) {
        int[] candies = {6, 6, 6, 6};
        int different = distributesCandies(candies);
        System.out.println(different);
    }
}
