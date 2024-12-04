package LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int num) {
        boolean happy = false;
        Set<Integer> set  = new HashSet<>();
        while (!set.contains(num)){
            set.add(num);
            num = sumOfSquares(num);
            if (num == 1){
                happy = true;
            }
        }
        return happy;
    }

    public static int sumOfSquares(int num){
        int n = 0;
        while (num > 0){
            int digit = num % 10;
            n += digit * digit;
            num /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
