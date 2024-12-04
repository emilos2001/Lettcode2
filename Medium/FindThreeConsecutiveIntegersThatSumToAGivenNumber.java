package LeetCode.Medium;

import java.util.Arrays;

public class FindThreeConsecutiveIntegersThatSumToAGivenNumber {
    public static long[] sumOfThree(long num) {
        if (num % 3 == 0) {
            long mod = num / 3;
            return new long[]{mod - 1, mod, mod + 1};
        }
        return new long[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfThree(30)));
    }
}
