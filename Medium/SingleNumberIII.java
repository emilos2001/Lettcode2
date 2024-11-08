package LeetCode.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {
    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] arr = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                arr[i++] = entry.getKey();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
}
