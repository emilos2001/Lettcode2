package LeetCode.Easy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            queue.offer(stone);
        }
        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            if (x != y) {
                queue.offer(y - x);
            }
        }
        if (queue.isEmpty()) {
            return 0;
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        int[] stones = {1};
        System.out.println(lastStoneWeight(stones));
    }
}
