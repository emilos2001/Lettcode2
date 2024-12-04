package LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimePairsWIthTargetSum {
    public static List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++){
            isPrime[i] = true;
        }
        for(int i =2; i * i < n; i++){
            if (isPrime[i]){
                for (int j = i * i; j < n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n / 2; i++){
            int index = n - i;
            if (isPrime[i] &&isPrime[index]){
                list.add(Arrays.asList(i, index));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findPrimePairs(10));
    }
}
