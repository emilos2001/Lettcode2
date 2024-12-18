package LeetCode.Medium;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
//        int[] res = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int prod = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if(i != j){
//                    prod *= nums[j];
//                }
//            }
//            res[i] = prod;
//        }
//        return res;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] k = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++){
            k[i] = left[i] * right[i];
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
