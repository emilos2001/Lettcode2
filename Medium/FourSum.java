package LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums , int target){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for (int j = i + 1; j < nums.length; j++){
                if(j > 0 && nums[i] == nums[j - 1]){
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;
                while(k < l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target){
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k + 1]){
                            k++;
                        }
                        while(k < l && nums[l] == nums[l + 1]){
                            l--;
                        }
                    } else if (sum < target){
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}