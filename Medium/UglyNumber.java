package LeetCode.Medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class UglyNumber {
    public static int nthUglyNumber(int n) {
        int[] primes = {2, 3, 5};
        long ugly = 1;
        Queue<Long> queue = new PriorityQueue<>();
        Set<Long> visited = new HashSet<>();
        queue.add(ugly);
        visited.add(ugly);
        for (int i = 0; i < n; i++) {
            ugly = queue.poll();
            for (int j : primes) {
                long newUgly = ugly * j;
                if (visited.add(newUgly)) {
                    queue.add(newUgly);
                }
            }
        }
        return (int) ugly;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
