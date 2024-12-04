package LeetCode.Easy;

public class ValidPerfectSquare {
    public static boolean validPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num == 0) {
            return true;
        }
        int i = 0;
        int j = num;
        while (i <= j) {
            int mid  = i  +  (j - i) / 2;
            long midSquare = (long)mid * mid;
            if (midSquare == num){
                return true;
            } else if (midSquare < num){
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(validPerfectSquare(num));
    }
}
