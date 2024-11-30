package LeetCode.Easy;

import java.util.Arrays;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        String[] strings = new String[score.length];
        int[][] newScore = new int[score.length][2];
        for (int i = 0; i < score.length; i++) {
            newScore[i][0] = score[i];
            newScore[i][1] = i;
        }
        Arrays.sort(newScore, (a, b) -> Integer.compare(b[0], a[0]));
        for (int i = 0; i < score.length; i++) {
            int place = newScore[i][1];
            switch (i) {
                case 0:
                    strings[place] = "Gold Medal";
                    break;
                case 1:
                    strings[place] = "Silver Medal";
                    break;
                case 2:
                    strings[place] = "Bronze Medal";
                    break;
                default:
                    strings[place] = String.valueOf(i + 1);
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        String[] ranks = findRelativeRanks(score);
        for (String rank : ranks) {
            System.out.println(rank);
        }
    }
}
