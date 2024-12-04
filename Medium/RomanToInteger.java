package LeetCode.Medium;

public class RomanToInteger {
    public static String toRoman(int num){
        String roman = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        while(num > 0){
            if (num >= values[i]){
                roman += numerals[i];
                num -= values[i];
            } else {
                i++;
            }
        }
        return roman;
    }
    public static void main(String[] args) {
        int toRoman = 4;
        String roman = toRoman(toRoman);
        System.out.println(roman);
    }
}
