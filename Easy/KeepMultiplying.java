package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class KeepMultiplying {
    public static int findFinalValue(int[] arr, int original) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            while (list.contains(original)) {
                original *= 2;
            }
        }
        return original;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9};
        int result = findFinalValue(nums, 2);
        System.out.println(result);
    }
}
