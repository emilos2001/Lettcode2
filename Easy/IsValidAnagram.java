package LeetCode.Easy;

import java.util.Locale;

public class IsValidAnagram {
    public static boolean isPalindrome(String str){
        boolean isPalindorme = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< str.length(); i++){
            char c   = str.charAt(i);
            if (Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else if(!Character.isWhitespace(c)){
                sb.append(c);
            }
        }

        String palindrome = sb.toString();
        palindrome = palindrome.replaceAll("[^a-zA-Z0-9]", "");
        for(int i = 0; i < palindrome.length() / 2; i++){
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)){
                isPalindorme = false;
                break;
            }
        }
        return isPalindorme;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
