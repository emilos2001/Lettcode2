package LeetCode.Easy;

public class ThirdMaximumNumber {
    public static int thirdMaximum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int third = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                third++;
            }
            if (third == 3) {
                return nums[i];
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMaximum(nums));
    }
}
