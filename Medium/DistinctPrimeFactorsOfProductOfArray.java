package LeetCode.Medium;

import java.util.HashSet;
import java.util.Set;

public class DistinctPrimeFactorsOfProductOfArray {
    public static int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            for (int j = 2; j <= i; j++){
                while (i % j == 0){
                    set.add(j);
                    i /= j;
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 16};
        System.out.println(distinctPrimeFactors(nums));
    }
}
