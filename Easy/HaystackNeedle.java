package LeetCode.Easy;

public class HaystackNeedle {
    public static int haystackLength(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        int length = haystack.length() - needle.length();
        for(int i = 0; i < length; i++){
            if (haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbut";
        String needle = "sad";
        System.out.println(haystackLength(haystack, needle));
    }
}
