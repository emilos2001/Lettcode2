package LeetCode.Easy;

public class CountTheNumberOfIncremovableSubarrays {
    public static int incremovableSubarrayCount(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (isSorting(nums, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isSorting(int[] array, int start, int end) {
        for (int i = 0; i < start - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        for (int i = end + 1; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        if (start > 0 && end < array.length - 1 && array[start - 1] >= array[end + 1]) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {6,5,7,8};
        System.out.println(incremovableSubarrayCount(nums));
    }
}
