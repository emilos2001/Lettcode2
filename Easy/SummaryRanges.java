package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summary(int[] nums) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int start = i;
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != i) {
                list.add(nums[start] + "->" + nums[i]);
            } else {
                list.add(String.valueOf(nums[i]));
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> list = summary(nums);
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
