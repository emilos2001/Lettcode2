package LeetCode.Medium;

public class MaxConsecutivesOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int zeros = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
            while (zeros > k){
                if (nums[j] == 0){
                    zeros--;
                }
                j++;
            }
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
