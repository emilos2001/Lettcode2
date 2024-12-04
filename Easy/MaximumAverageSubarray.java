package LeetCode.Easy;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        maxSum = currSum;
        for (int i = k; i < nums.length; i++) {
            currSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currSum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 6};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
