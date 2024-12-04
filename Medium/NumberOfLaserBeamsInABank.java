package LeetCode.Medium;

public class NumberOfLaserBeamsInABank {
    public static int numberOfBeams(String[] bank) {
        int ans = 0;
        int prev = 0;
        for (String b : bank) {
            int count = 0;
            for (char c : b.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            if (count > 0) {
                ans += prev * count;
                prev = count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] bank = {"011001", "000000", "010100", "001000"};
        System.out.println(numberOfBeams(bank));
    }
}
