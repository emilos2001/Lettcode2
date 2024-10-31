package LeetCode.Medium;

public class HoseRobber {
    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] robbed = new int[nums.length];
        robbed[0] = nums[0];
        robbed[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            robbed[i] = Math.max(robbed[i - 1], robbed[i - 2] + nums[i]);
        }

        return robbed[nums.length - 1];
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int robbed = rob(nums);
        System.out.println(robbed);
    }
}
