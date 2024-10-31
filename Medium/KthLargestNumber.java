package LeetCode.Medium;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestNumber {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i : nums){
            queue.offer(i);
            if (queue.size() > k){
                queue.poll();
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }
}
