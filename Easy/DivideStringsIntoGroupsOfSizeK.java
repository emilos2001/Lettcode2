package LeetCode.Easy;

import java.util.Arrays;

public class DivideStringsIntoGroupsOfSizeK {
    public static String[] divideString(String s, int k, char fill) {
        int length = (s.length() + k - 1) / k;
        String[] strings = new String[length];
        int index = 0;
        for (int i = 0; i < s.length(); i += k) {
            if (i + k <= s.length()) {
                strings[index++] = s.substring(i, i + k);
            } else {
                StringBuilder sb = new StringBuilder(s.substring(i));
                while (sb.length() < k) {
                    sb.append(fill);
                }
                strings[index++] = sb.toString();
            }
        }
        return strings;
    }


    public static void main(String[] args) {
        String s = "abcdefghij";
        System.out.println(Arrays.toString(divideString(s, 3, 'x')));
    }
}
