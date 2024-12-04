package LeetCode.Medium;

public class FindTriangularSumOfAnArray {
    public static int triangularSum(int[] nums) {
        for (int i = nums.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(triangularSum(nums));
    }
}
