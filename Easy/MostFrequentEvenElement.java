package LeetCode.Easy;

import java.util.HashMap;

public class MostFrequentEvenElement {
    public static int mostFrequentEvenElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int mostFrequent = -1;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                int count = map.get(nums[i]);
                if (count > max  || (count == max && nums[i] < mostFrequent)){
                    mostFrequent = nums[i];
                    max = count;
                }
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 4, 4, 1};
        System.out.println(mostFrequentEvenElement(nums));
    }
}
