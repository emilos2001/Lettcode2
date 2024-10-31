package LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexOfValidSplit {
    public static int minimumIndexOfSplit(List<Integer> nums) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            map1.put(nums.get(i), map1.getOrDefault(nums.get(i), 0) + 1);
        }
        int ans = -1;
        for (int j = 0; j < nums.size(); j++){
            map1.put(nums.get(j), map1.getOrDefault(nums.get(j), 0) - 1);
            map2.put(nums.get(j), map2.getOrDefault(nums.get(j), 0) + 1);
            if (map1.get(nums.get(j)) * 2 > j + 2 && nums.get(j) * 2 > nums.size() - j - 1) {
                ans = j;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        int[] num = {3, 3, 3, 3, 7, 2, 2};
        for (int i = 0; i < num.length; i++) {
            nums.add(num[i]);
        }
        int j = minimumIndexOfSplit(nums);
        System.out.println(j);
    }
}
