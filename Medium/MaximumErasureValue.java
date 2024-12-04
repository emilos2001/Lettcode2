package LeetCode.Medium;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {
    public static int maximumUniqueSubArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int maxSum = 0;
        int j = 0;
        for (int i = 0 ; i < nums.length; i++){
            while(set.contains(nums[i])){
                set.remove(nums[i]);
                sum -= nums[j];
                j++;
            }
            set.add(nums[i]);
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {4,2,4,5,6};
        System.out.println(maximumUniqueSubArray(array));
    }

}
