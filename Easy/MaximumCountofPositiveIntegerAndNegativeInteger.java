package LeetCode.Easy;

public class MaximumCountofPositiveIntegerAndNegativeInteger {
    public static int maximumCount(int[] nums) {
        int maximumCount = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positive++;
            } else if (nums[i] < 0) {
                negative++;
            }
        }
        maximumCount = Math.max(positive, negative);
        return maximumCount;
    }

    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
}
