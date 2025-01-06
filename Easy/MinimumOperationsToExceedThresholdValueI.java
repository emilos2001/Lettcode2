package LeetCode.Easy;

import java.util.Arrays;

public class MinimumOperationsToExceedThresholdValueI {
    public static int minOperations(int[] nums, int k) {
//        Arrays.sort(nums);
//        int left = 0;
//        int right = nums.length - 1;
//        int index = nums.length;
//        while (left < right){
//            int mid = left + (right - left) / 2;
//            if (nums[mid] >= k){
//                index = mid;
//                right = mid - 1;
//            } else if (nums[mid] < k){
//                left = mid + 1;
//            }
//        }
        int index = 0;
        for (int i : nums){
            if (i < k){
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        System.out.println(minOperations(nums, 10));
    }
}
