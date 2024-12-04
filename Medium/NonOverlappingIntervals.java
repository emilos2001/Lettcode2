package LeetCode.Medium;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int overLapping = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int previous = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (previous > intervals[i][0]) {
                overLapping++;
            } else {
                previous = intervals[i][1];
            }
        }
        return overLapping;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 100}, {11, 22}, {1, 11}, {1, 12}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
