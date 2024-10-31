package LeetCode.Medium;

public class PrimePalindrome {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int primePalindrome(int n) {
        int reverseNum = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            reverseNum = reverseNum * 10 + digit;
            n /= 10;
        }
        if (isPrime(n)) {
            if (n == reverseNum) {
                return reverseNum;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(primePalindrome(11));
    }
}
