package LeetCode.Easy;

public class ReverseString {
    public static String reverseString(char []str) {
        char[] chars = new char[str.length];
        for (int i = 0; i < chars.length; i++){
            chars[chars.length - 1 - i] = str[i];
        }
        return new String(chars);
    }

    public static void main(String[] args){
        char[] c  = {'h', 'e', 'l' , 'l', 'o'};
        System.out.println(reverseString(c));
    }
}
