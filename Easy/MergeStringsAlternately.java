package LeetCode.Easy;

public class MergeStringsAlternately {
    public static String mergeStrings(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < s1.length() || j < s2.length()) {
            if (i < s1.length()) {
                sb.append(s1.charAt(i));
                i++;
            }
            if (j < s2.length()) {
                sb.append(s2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "pqrs";
        System.out.println(mergeStrings(s1, s2));
    }
}
