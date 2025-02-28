package LeetCode.Medium;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        String[] strings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i < values.length;  i++){
            while (num  >= values[i]){
                sb.append(strings[i]);
                num  -=  values[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 58;
        System.out.println(intToRoman(num));
    }
}
