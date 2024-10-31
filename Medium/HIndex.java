package LeetCode.Medium;

import java.util.Arrays;

public class HIndex {
    public static int hIndex(int[] citations) {
        int index = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int remaining = citations.length - i;
            if (citations[i] >= remaining) {
                index = remaining;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(hIndex(citations));
    }
}
