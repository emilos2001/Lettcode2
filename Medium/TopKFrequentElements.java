package LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] list = new ArrayList[nums.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            list[freq].add(entry.getKey());
        }
        int[] res = new int[k];
        int j = 0;
        for (int i = list.length - 1; i >= 0; i--) {
            for (int num : list[i]) {
                res[j++] = num;
                if (j == k) {
                    return res;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] freq = topKFrequent(nums, 2);
        for (int i : freq) {
            System.out.print(i+" ");
        }
    }
}
