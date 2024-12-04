package LeetCode.Easy;

import java.util.Arrays;

public class MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 1; i < intervals.length; i++){
            int[] roomA = intervals[i - 1];
            int[] roomB = intervals[i];
            if(roomA[1] > roomB[0]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 3}, {2, 10}, {15, 20}};
        System.out.println(canAttendMeetings(intervals));
    }
}
