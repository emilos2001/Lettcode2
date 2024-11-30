package LeetCode.Medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long uglyNum = 1;
        Queue<Long> queue =  new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        queue.add(uglyNum);
        set.add(uglyNum);
        for (int i = 0; i < n; i++){
            uglyNum = queue.poll();
            for (int prime : primes) {
                long k = uglyNum * prime;
                if (set.add(k)) {
                    queue.add(k);
                }
            }
        }
        return (int) uglyNum;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,13,19};
        System.out.println(new SuperUglyNumber().nthSuperUglyNumber(12,nums));
    }
}
