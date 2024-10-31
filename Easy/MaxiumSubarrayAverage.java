package LeetCode.Easy;

public class MaxiumSubarrayAverage {
    public static double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;
        double currSum = 0;

        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        maxSum = currSum;
        for (int i = k; i < nums.length; i++) {
            currSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currSum);
        }
        currSum = maxSum;
        return currSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
