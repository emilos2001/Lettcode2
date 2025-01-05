package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversation {
    public static String convert(String s, int numRows){
        if (numRows == 1 || s.length() <= numRows){
            return s;
        }
        int index = 0;
        int j = 0;
        List<Character>[] lists = new ArrayList[numRows];
        for(int i = 0; i < numRows; i++){
            lists[i] = new ArrayList<>();
        }
        for (char c : s.toCharArray()){
            lists[index].add(c);
            if (index == 0){
                j = 1;
            } else if (index == numRows - 1) {
                j = -1;
            }
            index += j;
        }
        StringBuilder sb = new StringBuilder();
        for (List<Character> list : lists){
            for(char c : list){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s,3));
    }
}
