package LeetCode.Easy;

public class ApplyOperation {
    public static int[] applyOperation(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        int[] res = applyOperation(nums);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
