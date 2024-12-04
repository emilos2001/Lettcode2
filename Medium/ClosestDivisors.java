package LeetCode.Medium;

import java.util.Arrays;

public class ClosestDivisors {
    public static int[] closestDivisors(int num) {
        int[] result1 = findClosestDivisors(num + 1);
        int[] result2 = findClosestDivisors(num + 2);

        // Compare the absolute differences between divisors and return the closer pair
        if (Math.abs(result1[0] - result1[1]) <= Math.abs(result2[0] - result2[1])) {
            return result1;
        } else {
            return result2;
        }
    }

    private static int[] findClosestDivisors(int target) {
        int sqrt = (int) Math.sqrt(target);
        for (int i = sqrt; i > 0; i--) {
            if (target % i == 0) {
                return new int[]{i, target / i};
            }
        }
        return new int[]{}; // Should not happen for valid inputs
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(Arrays.toString(closestDivisors(num)));
    }
}
