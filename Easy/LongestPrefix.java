package LeetCode.Easy;

public class LongestPrefix {
    public static String longestPrefix(String[] input) {
       String prefix = input[0];
       for (int i = 1; i<input.length; i++) {
           while (input[i].indexOf(prefix) != 0) {
               prefix = prefix.substring(0, prefix.length() - 1);
               if (prefix.isEmpty()){
                   return "";
               }
           }
       }
       return prefix;
    }

    public static String longestSuffix(String[] input) {
        String suffix = input[0];
        for (int i = 1; i<input.length; i++) {
            while (!input[i].endsWith(suffix)) {
                suffix = suffix.substring(1);
            }
            if (suffix.isEmpty()){
                return "";
            }
        }
        return suffix;
    }

    public static void main(String[] args) {
//        String[] prefix = {"flower", "flow", "flight"};
//        System.out.println(longestPrefix(prefix));
        String[] suffix = {"backing", "washing", "cooking"};
        System.out.println(longestSuffix(suffix));
    }
}
