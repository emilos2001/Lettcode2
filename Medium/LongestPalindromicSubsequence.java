package LeetCode.Medium;

public class LongestPalindromicSubsequence {
    public static int longestPalindromeSubseq(String s){
        String reverse = new StringBuilder(s).reverse().toString();
        int m = s.length();
        int[][] lps = new int[m + 1][m + 1];
        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= m; j++){
                if (s.charAt(i - 1) == reverse.charAt(j - 1)){
                    lps[i][j] = lps[i - 1][j - 1] + 1;
                } else {
                    lps[i][j] = Math.max(lps[i - 1][j], lps[i][j - 1]);
                }
            }
        }
        return lps[m][m];
    }
    public static void main(String[] args) {
        String s = "bbbabe";
        System.out.println(longestPalindromeSubseq(s));
    }
}
