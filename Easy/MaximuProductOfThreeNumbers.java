package LeetCode.Easy;

import java.util.Arrays;

public class MaximuProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        int product = 0;
        Arrays.sort(nums);
        int option1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int option2 = nums[0] * nums[1] * nums[nums.length - 1];
        product = Math.max(option1, option2);
        return product;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(maximumProduct(nums));
    }
}
