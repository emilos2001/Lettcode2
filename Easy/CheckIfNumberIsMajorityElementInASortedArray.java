package LeetCode.Medium;

import java.util.Arrays;

public class CheckIfNumberIsMajorityElementInASortedArray {
    public static boolean majorityElement(int[] nums, int target) {
        int left = search(nums, target);
        int right = search(nums, target + 1);
        if (left + right > nums.length / 2) {
            return true;
        }
        return false;
    }

    static int search(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5, 6, 6};
        System.out.println(majorityElement(nums, 2));
    }
}
