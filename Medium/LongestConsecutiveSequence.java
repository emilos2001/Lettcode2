package LeetCode.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int longest = 0;
//        int j = 1;
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++){
//            if (nums[i] != nums[i - 1]) {
//                if (nums[i] == nums[i - 1] + 1) {
//                    j++;
//                } else {
//                    longest = Math.max(longest, j);
//                }
//            }
//        }
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int j = 1;
                while (set.contains(current + 1)) {
                    current++;
                    j++;
                }
                longest = Math.max(longest, j);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
