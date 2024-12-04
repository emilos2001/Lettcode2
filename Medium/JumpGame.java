package LeetCode.Medium;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        boolean canJump = false;
        int goal = 0;
        for (int i = 0; i < nums.length; i++){
            if (i > goal){
                return canJump;
            }
            if (i + nums[i] > goal){
                goal = i + nums[i];
            }
        }
        canJump = true;
        return canJump;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
