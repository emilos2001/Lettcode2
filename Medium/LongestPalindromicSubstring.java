package LeetCode.Medium;

public class LongestPalindromicSubstring {
    //    public static String longestPalindrome(String s) {
//        int l = s.length();
//        int max = 1;
//        int min = 0;
//        for (int i = 0; i < l; i++) {
//            for (int j = i; j < l; j++) {
//                if (checkPal(s, i, j) && (j - i + 1) > max) {
//                    min = i;
//                    max = j - i + 1;
//                }
//            }
//        }
//        return s.substring(min , min + max);
//    }
//
//    private static boolean checkPal(String s, int low, int hi) {
//        while (low < hi) {
//            if (s.charAt(low) != s.charAt(hi)) {
//                return false;
//            }
//            low++;
//            hi--;
//        }
//        return true;
//    }
    public static String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                boolean compare = (s.charAt(i) == s.charAt(j));
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    dp[i][j] = compare;
                } else {
                    dp[i][j] = (compare && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && (j - i + 1) > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String pal = "babad";
        System.out.println(longestPalindrome(pal));
    }
}
