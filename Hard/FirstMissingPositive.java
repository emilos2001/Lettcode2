package LeetCode.Hard;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
//        int count = 0;
//        for (int num : nums){
//            if (num > 0){
//                count++;
//            }
//        }
//        int[] filterNums = new int[count];
//        for(int num : nums){
//            if (num > 0){
//                filterNums[count++] = num;
//            }
//        }
//        int[] filterNums = Arrays.stream(nums).filter(n -> n > 0).toArray();
//        Arrays.sort(filterNums);
//        int target = 1;
//        for (int n : filterNums) {
//            if (n == target) {
//                target++;
//            } else if (n > target) {
//                return target;
//            }
//        }
//        return target;
        for(int i = 0; i < nums.length; i++){
            while (nums[i] > 0 && nums[i] <= nums.length &&  nums[i] != nums[nums[i] - 1]){
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i+1){
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    private static void swap(int[]  nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
