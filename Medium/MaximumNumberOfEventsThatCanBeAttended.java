package LeetCode.Medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumNumberOfEventsThatCanBeAttended {
    public static int maxEvents(int[][] events) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;
        int day = 0;
        int results = 0;
        while (!pq.isEmpty() || index < events.length) {
            if (pq.isEmpty()) {
                day = events[index][0];
            }
            while (index < events.length && events[index][0] <= day) {
                pq.offer(events[index][1]);
                index++;
            }
            pq.poll();
            results++;
            day++;
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[][] events = {{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        System.out.println(maxEvents(events));
    }
}
