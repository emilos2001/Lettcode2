package LeetCode.Medium;

public class NextPermutation {
    public static int[] nextPermutation(int[] nums) {
        int m = -1;
        int n = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                m = i;
                break;
            }
        }
        if (m == -1) {
            reverse(nums, 0);
        } else {
            for (int i = nums.length - 1; i >= m; i--) {
                if (nums[i] > nums[m]) {
                    n = i;
                }
            }
            swap(nums, m, n);
            reverse(nums, m + 1);
        }
        return nums;
    }

    private static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nums = nextPermutation(nums);
        for (int num : nums){
            System.out.println(num);
        }
    }
}
