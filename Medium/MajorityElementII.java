package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        int count = 0;
        int majority = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (count == 0){
                majority = nums[i];
            }
            if (nums[i] == majority){
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == majority) {
                count++;
            }
        }
        if (count > nums.length / 2){
            list.add(majority);
        } else {
            for (int i = 0; i < nums.length; i++){
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<Integer> list = majorityElement(nums);
        System.out.println(list);
    }
}
