package LeetCode.Easy;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
            }
            if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
