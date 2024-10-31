package LeetCode.Medium;

public class TwoSumII {
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr. length; j++){
                if (target == arr[i] + arr[j]){
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int target = 6;
        int[] res = twoSum(arr, target);
        for (int i : res){
            System.out.print(i + " ");
        }
    }
}
