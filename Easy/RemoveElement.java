package LeetCode.Easy;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[i] = nums[j];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int value = 2;
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int result = removeElement(nums, value);
        System.out.println(result);
    }
}
