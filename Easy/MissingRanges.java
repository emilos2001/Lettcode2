package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int prev = lower - 1;
        for (int i = 0; i <= nums.length; i++) {
            int current = (i < nums.length) ? nums[i] : upper + 1;
            if (lower + 1 < upper - 1){
                result.add(getRange(prev +1, current - 1));
            }
            prev = current;
        }

        return result;
    }

    private static String getRange(int from, int to){
        if (from == to){
            return String.valueOf(from);
        }
        return  from + "->" + to;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0, upper = 99;
        System.out.println(findMissingRanges(nums, lower, upper));
    }
}
