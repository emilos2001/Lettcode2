package LeetCode.Medium;

public class primeNum {
    public static boolean isPrime(int n){
        boolean primeNum = false;
        for (int i = 2; i * i <= n; i++){
            if (n % i != 0){
                primeNum = true;
            }
        }
        return primeNum;
    }

    public static int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        for(int i = 2; i <= n; i++){
            if (isPrime(n)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
