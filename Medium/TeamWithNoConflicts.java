package LeetCode.Medium;

import java.util.Arrays;

public class TeamWithNoConflicts {
    public static int bestTeamScore(int[] scores, int[] ages) {
        int[][] players = new int[scores.length][2];
        for (int i = 0; i < scores.length; i++) {
            players[i][0] = ages[i];
            players[i][1] = scores[i];
        }
        Arrays.sort(players, (a, b) -> (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        int[] dp = new int[scores.length];
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            dp[i] = players[i][1];
            for (int j = 0; j < i; j++) {
                if (players[j][1] <= players[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + players[i][1]);
                }
            }
            maxScore = Math.max(maxScore, dp[i]);
        }
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + " ");
            }
        }
        return maxScore;
    }

    public static void main(String[] args) {
//        int[] scores = {1, 3, 5, 10, 15};
//        int[] ages = {1, 2, 3, 4, 5};
//        System.out.println(bestTeamScore(scores, ages)); // Output: 34

        int[] scores2 = {4, 5, 6, 5};
        int[] ages2 = {2, 1, 2, 1};
        System.out.println(bestTeamScore(scores2, ages2)); // Output: 16
//
//        int[] scores3 = {1, 2, 3, 5};
//        int[] ages3 = {8, 9, 10, 1};
//        System.out.println(bestTeamScore(scores3, ages3));
    }
}
