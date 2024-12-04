package LeetCode.Medium;

public class HouseRobberIV {
    public static int minCapability(int[] nums, int k) {
       int left = 0;
       int right = (int)1e9;
       while (left < right) {
           int mid = left + (right - left) / 2;
           int robbed = 0;
           for (int i = 0; i < nums.length && robbed < k; i++) {
               if (nums[i] <= mid) {
                   robbed++;
                   i++;
               }
           }
           if (robbed < k) {
               left = mid + 1;
           } else {
               right = mid;
           }
       }
       return left;
    }

    public static void main(String[] args) {
        int[] houseValues = {2,3,5,9};
        int k = 2;
        System.out.println(minCapability(houseValues, k));
    }
}
