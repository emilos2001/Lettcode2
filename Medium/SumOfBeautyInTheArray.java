package LeetCode.Medium;

public class SumOfBeautyInTheArray {
    public static int sumOfBeauty(int[] nums) {
        int total = 0;
        int lmax = nums[0];
        int[] rmin = new int[nums.length];
        rmin[nums.length - 1] = Integer.MAX_VALUE;
        for (int i = nums.length - 2; i >= 0; i--) {
            rmin[i] = Math.min(rmin[i + 1], nums[i + 1]);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                total++;
                if (lmax < nums[i] && nums[i] < rmin[i]) {
                    total++;
                }
            }
            lmax = Math.max(lmax, nums[i]);
        }

        return total;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOfBeauty(nums));
    }
}
