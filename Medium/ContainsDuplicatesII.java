package LeetCode.Medium;

import java.util.HashMap;

public class ContainsDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(i, nums[i]);
        }
        return false;
    }
}
