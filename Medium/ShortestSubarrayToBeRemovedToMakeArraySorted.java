package LeetCode.Medium;

public class ShortestSubarrayToBeRemovedToMakeArraySorted {
    public static int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }
        if (left == n - 1) {
            return 0;
        }

        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }
        int count = Math.min(arr.length - 1 - left - 1, right);
        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                count = Math.min(count, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,10,4,2,3,5};
        System.out.println(findLengthOfShortestSubarray(arr));
    }
}
